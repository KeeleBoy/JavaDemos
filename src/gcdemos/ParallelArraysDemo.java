package gcdemos;

public class ParallelArraysDemo {

	public static void main(String[] args) {
		String[] names = { "Beth", "Jim", "Sean", "Kim" };
		int[] uniforms = { 10, 22, 42, 7 };

		for (int i = 0; i < names.length; i++) {
			// next line has a problem with " wears" figure out why
			// System.out.println(names[i], + " wears " + uniforms[i]);
		}
	}

}
