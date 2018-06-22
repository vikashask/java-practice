package basic;

public class StaticMethod {
	static int cube(int x) {
		return x * x * x;
	}

	public static void main(String args[]) {
		int result = StaticMethod.cube(5);
		System.out.println(result);
	}
}
