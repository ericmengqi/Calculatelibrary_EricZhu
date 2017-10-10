
public class QuadraticClient {

	/*
	 * This method returns the values of the discriminant from the coefficients of a
	 * quadratic equation
	 */
	public static double discriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	// This method rounds a double correctly to 2 decimal places.
	public static double round2(double a) {
		a = a * 100;
		int b = (int) a;
		double c = b;
		return a = c / 100;
	}
	
	// This method provides the square root of a double
	public static double sqrt(double a) {
		if (a < 0) {
			throw new IllegalArgumentException("Input is negative, cannot take square root of negative number");
		}
		double num1;
		double root = a / 2;
		do {
			num1 = root;
			root = (num1 + (a / num1)) / 2.0;
		} while ((num1 - root) != 0);
		return round2(root);
	}
	
	/*
	 * This method uses the coefficients of a quadratic equation and uses the
	 * quadratic formula to approximate the real roots
	 */
	public static String quadForm(int a, int b, int c) {
		if (discriminant(a, b, c) < 0) {
			return "no real roots";
		} else if (discriminant(a, b, c) == 0) {
			String root = round2(-b / (2 * a)) + "";
			return root;
		} else {
			double root1 = (-b + sqrt(discriminant(a, b, c))) / (2 * a);
			double root2 = (-b - sqrt(discriminant(a, b, c))) / (2 * a);
			if (root1 < root2) {
				String roots = round2(root1) + " and " + round2(root2);
				return roots;

			} else {
				String roots = round2(root1) + " and " + round2(root2);
				return roots;
			}
		}
	}
	
	}
