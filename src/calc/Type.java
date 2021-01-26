package calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* Imitates an enum using a class due to java's limitation
 * (e.g. generic types are not allowed for Enums).
 */
@SuppressWarnings("rawtypes")
public class Type<T> {
	// add object/classes/interfaces etc
	public static final Type<Function> FUNCTION = new Type<>(Function.class);
	public static final Type<Matrix> MATRIX = new Type<>(Matrix.class);
	public static final Type<ArrayList> VECTOR = new Type<>(ArrayList.class);
	public static final Type<HashSet> SET = new Type<>(HashSet.class);
	public static final Type<String> STRING = new Type<>(String.class);
	public static final Type<Character> CHAR = new Type<>(Character.class);
	public static final Type<Complex> COMPLEX = new Type<>(Complex.class);
	public static final Type<Double> FLOAT = new Type<>(Double.class);
	public static final Type<Integer> INT = new Type<>(Integer.class);
	public static final Type<Boolean> BOOL = new Type<>(Boolean.class);
	
	private final Class<T> cls;
	
	private Type(Class<T> cls) {
		this.cls = cls;
	}
	
	public Class<T> getTypeClass() {
		return cls;
	}
	
	public T cast(Object o) {
		return getTypeClass().cast(o);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!Type.class.isInstance(o))
			return false;
		Type<?> other = Type.class.cast(o);
		return getTypeClass().equals(other.getTypeClass());
	}
	
	// Imitates Enum.values() method
	public static Type<?>[] values() {
		return new Type[] { FUNCTION, MATRIX, VECTOR, SET, STRING, CHAR, COMPLEX, FLOAT, INT, BOOL };
	}
	
	// Defines data hierarchy
	public static Class<?> biggest(Class<?>...types) {
		if (types.length == 0)
			throw new IllegalArgumentException("Types list cannot be empty.");
		List<Class<?>> list = Stream.of(types).collect(Collectors.toList());
		if (list.contains(Function.class))
			return Function.class;
		else if (list.contains(Matrix.class))
			return Matrix.class;
		else if (list.contains(ArrayList.class))
			return ArrayList.class;
		else if (list.contains(HashSet.class))
			return HashSet.class;
		else if (list.contains(String.class))
			return String.class;
		else if (list.contains(Character.class))
			return Character.class;
		else if (list.contains(Complex.class))
			return Complex.class;
		else if (list.contains(Double.class))
			return Double.class;
		else if (list.contains(Integer.class))
			return Integer.class;
		else if (list.contains(Boolean.class))
			return Boolean.class;
		throw new IllegalArgumentException("Types list contains invalid class type, got : "+Arrays.toString(types)+" but none from : "+Arrays.toString(values()));
	}
	
	/* Type checks utility methods */
	
	public static <T> boolean is(Object o, Class<T> cls) {
		return cls.isInstance(o);
	}
	
	public static boolean isAny(Object o, Class<?>...clss) {
		boolean is = false;
		for (Class<?> cls : clss) 
			is |= is(o, cls);
		return is;
	}
	
	public static boolean isNotAny(Object o, Class<?>...clss) {
		return !isAny(o, clss);
	}
	
	/* Type casting methods */
	
	// Type cast dispatcher
	public static <T> T convert(Object o, Class<T> to) {	
		Class<?> cls = o.getClass();
		if (cls.equals(Boolean.class))
			return convertBooleanTo(Boolean.class.cast(o), to);
		else if (cls.equals(Integer.class))
			return convertIntegerTo(Integer.class.cast(o), to);
		else if (cls.equals(Double.class))
			return convertDoubleTo(Double.class.cast(o), to);
		else if (cls.equals(Complex.class))
			return convertComplexTo(Complex.class.cast(o), to);
		else if (cls.equals(String.class))
			return convertStringTo(String.class.cast(o), to);
		else if (cls.equals(HashSet.class) || cls.equals(ArrayList.class) || cls.equals(Matrix.class) || cls.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert sets, vectors, matrices and functions to primitive or other types.");
		else 
			throw new IllegalArgumentException("No mapping exists from "+cls+" to "+to+".");
	}
	
	public static <T> T convertStringTo(String s, Class<T> to) {
		if (to.equals(Boolean.class))
			return !s.equals("") ? to.cast(true) : to.cast(false);
		else if (to.equals(Integer.class))
			return to.cast(Integer.parseInt(s));
		else if (to.equals(Double.class))
			return to.cast(Double.parseDouble(s));
		else if (to.equals(Character.class))
			return to.cast(s.charAt(0));
		else if (to.equals(String.class))
			return to.cast(s);
		else if (to.equals(HashSet.class))
			return to.cast(new HashSet<>(Arrays.asList(s)));
		else if (to.equals(ArrayList.class))
			return to.cast(new ArrayList<>(Arrays.asList(s)));
		else if (to.equals(Complex.class) || to.equals(Matrix.class) || to.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert string to complex, matrix or function.");
		else 
			throw new IllegalArgumentException("No mapping exists from string to "+to+".");
	}
	
	public static <T> T convertCharacterTo(Character c, Class<T> to) {
		if (to.equals(Boolean.class))
			return c.equals(Character.valueOf('1')) ? to.cast(true) : to.cast(false);
		else if (to.equals(Integer.class))
			return to.cast((int) c.charValue());
		else if (to.equals(Double.class))
			return to.cast(Integer.valueOf((int) c.charValue()).doubleValue());
		else if (to.equals(Complex.class))
			return to.cast(new Complex((int) c.charValue()));
		else if (to.equals(Character.class))
			return to.cast(c);
		else if (to.equals(String.class))
			return to.cast(c.toString());
		else if (to.equals(HashSet.class))
			return to.cast(new HashSet<>(Arrays.asList(c)));
		else if (to.equals(ArrayList.class))
			return to.cast(new ArrayList<>(Arrays.asList(c)));
		else if (to.equals(Matrix.class))
			return to.cast(Matrix.identity(1).forEachApplySelf(v -> ((Integer) ((int)c.charValue())).doubleValue()));
		else if (to.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert character to function.");
		else 
			throw new IllegalArgumentException("No mapping exists from character to "+to+".");
	}
	
	public static <T> T convertComplexTo(Complex c, Class<T> to) {
		if (to.equals(Boolean.class))
			return !c.equals(Complex.ZERO) ? to.cast(true) : to.cast(false);
		else if (to.equals(Integer.class))
			return to.cast((int) c.real());
		else if (to.equals(Double.class))
			return to.cast(c.real());
		else if (to.equals(Complex.class))
			return to.cast(c);
		else if (to.equals(Character.class))
			return to.cast((char) Double.valueOf(c.real()).intValue());
		else if (to.equals(String.class))
			return to.cast(c.toString());
		else if (to.equals(HashSet.class))
			return to.cast(new HashSet<>(Arrays.asList(c.real(), c.imaginary())));
		else if (to.equals(ArrayList.class))
			return to.cast(new ArrayList<>(Arrays.asList(c.real(), c.imaginary())));
		else if (to.equals(Matrix.class))
			return to.cast(new Matrix(c.matrixify()));
		else if (to.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert complex to function.");
		else 
			throw new IllegalArgumentException("No mapping exists from complex to "+to+".");
	}
	
	public static <T> T convertDoubleTo(Double b, Class<T> to) {
		if (to.equals(Boolean.class))
			return !b.equals(Double.valueOf(0d)) ? to.cast(true) : to.cast(false);
		else if (to.equals(Integer.class))
			return to.cast(b.intValue());
		else if (to.equals(Double.class))
			return to.cast(b);
		else if (to.equals(Complex.class))
			return to.cast(new Complex(b));
		else if (to.equals(Character.class))
			return to.cast((char) b.intValue());
		else if (to.equals(String.class))
			return to.cast(b.toString());
		else if (to.equals(HashSet.class))
			return to.cast(new HashSet<>(Arrays.asList(b)));
		else if (to.equals(ArrayList.class))
			return to.cast(new ArrayList<>(Arrays.asList(b)));
		else if (to.equals(Matrix.class))
			return to.cast(Matrix.identity(1).forEachApplySelf(v -> b.doubleValue()));
		else if (to.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert double to function.");
		else 
			throw new IllegalArgumentException("No mapping exists from double to "+to+".");
	}
	
	public static <T> T convertIntegerTo(Integer b, Class<T> to) {
		if (to.equals(Boolean.class))
			return !b.equals(Integer.valueOf(0)) ? to.cast(true) : to.cast(false);
		else if (to.equals(Integer.class))
			return to.cast(b);
		else if (to.equals(Double.class))
			return to.cast(b.doubleValue());
		else if (to.equals(Complex.class))
			return to.cast(new Complex(b));
		else if (to.equals(Character.class))
			return to.cast((char) b.intValue());
		else if (to.equals(String.class))
			return to.cast(b.toString());
		else if (to.equals(HashSet.class))
			return to.cast(new HashSet<>(Arrays.asList(b)));
		else if (to.equals(ArrayList.class))
			return to.cast(new ArrayList<>(Arrays.asList(b)));
		else if (to.equals(Matrix.class))
			return to.cast(Matrix.identity(1).forEachApplySelf(v -> b.doubleValue()));
		else if (to.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert integer to function.");
		else 
			throw new IllegalArgumentException("No mapping exists from integer to "+to+".");
	}
	
	public static <T> T convertBooleanTo(boolean b, Class<T> to) {
		if (to.equals(Boolean.class))
			return to.cast(b);
		else if (to.equals(Integer.class))
			return b ? to.cast(1) : to.cast(0);
		else if (to.equals(Double.class))
			return b ? to.cast(1d) : to.cast(0d);
		else if (to.equals(Complex.class))
			return b ? to.cast(Complex.ONE) : to.cast(Complex.ZERO);
		else if (to.equals(Character.class))
			return b ? to.cast('1') : to.cast('0');
		else if (to.equals(String.class))
			return b ? to.cast("1") : to.cast("0");
		else if (to.equals(HashSet.class))
			return to.cast(new HashSet<>(Arrays.asList(b)));
		else if (to.equals(ArrayList.class))
			return to.cast(new ArrayList<>(Arrays.asList(b)));
		else if (to.equals(Matrix.class))
			return b ? to.cast(Matrix.identity(1)) : to.cast(new Matrix(1, 1));
		else if (to.equals(Function.class))
			throw new IllegalArgumentException("Cannot convert boolean to function.");
		else 
			throw new IllegalArgumentException("No mapping exists from boolean to "+to+".");
	}
	
	public static void main(String[] args) {
//		System.out.println(biggest(Boolean.class, Integer.class, Double.class, Complex.class));
		System.out.println(convert(3, String.class));
		System.out.println(convert(3, String.class).getClass());
	}
}
