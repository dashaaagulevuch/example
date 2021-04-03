package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;

		double x1;
		double x2;

		double result;

		a = 4.0;
		b = 2.0;
		c = 3.0;

		x1 = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c) / 2 * a);
		x2 = Math.pow(a, 3) * c + b;
		result = x1 - x2;

		System.out.println("Значение выражения = " + result);

	}

}
