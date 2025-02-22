package demo;

public class hrr {
	public static void main(String[] args) {
		double number = 3.0;
		double tolerance = 0.000001; // Define how precise the answer should be
		double estimate = number / 2.0; // Initial guess (we use half of the number)

		while (true) {
			double betterEstimate = 0.5 * (estimate + number / estimate);
			if (Math.abs(betterEstimate - estimate) < tolerance) {
				break;
			}
			estimate = Math.abs(betterEstimate);
		}

		System.out.println("Square root of " + number + " is approximately " + estimate);
	}
}
