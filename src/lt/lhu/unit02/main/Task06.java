package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc;
		double a;
		double b;
		double c;
		double d;

		double result;

		sc = new Scanner(System.in);

		System.out.println("¬ведите действительное значение ");
		a = sc.nextInt();

		System.out.println("¬ведите действительное значение ");
		b = sc.nextInt();

		System.out.println("¬ведите действительное значение ");
		c = sc.nextInt();

		System.out.println("¬ведите действительное значение ");
		d = sc.nextInt();

		result = ((a / c) * (b / d)) - ((a * b - c) / c * d);

		System.out.println("«начение выражени€ = " + result);
	}

}
