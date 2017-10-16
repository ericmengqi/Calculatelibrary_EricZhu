import java.util.Scanner;
 class Quadratic {

	private static Scanner console;

	public static void QuadraticDescriber(double a, double b, double c) {
		System.out.println ("Welcome to Quadratic Describer");
		System.out.println("Provide values for coefficients a, b, and c");
		System.out.println(" ");
		console = new Scanner(System.in);
		double a1 = console.nextInt();
		System.out.println("a:" + a1);
		double b1 = console.nextInt();
		System.out.println("b:" + b1);
		double c1 = console.nextInt();
		System.out.println("c:" + c1);
}
}