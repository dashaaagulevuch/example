package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc;
		int a;
		int b;
		int c;

		double result;

		sc = new Scanner(System.in);

		System.out.print("¬ведите значение a = ");
		a = sc.nextInt();

		System.out.print("¬ведите значение b = ");
		b = sc.nextInt();

		System.out.print("¬ведите значение c = ");
		c = sc.nextInt();

		result = Math.pow(a, 2) - Math.pow((b - c), 2) + Math.log(Math.pow(b, 2) + 1);

		System.out.println("«начение выражени€ = " + result);

	}

}
