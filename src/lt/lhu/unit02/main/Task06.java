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

		System.out.println("������� �������������� �������� ");
		a = sc.nextInt();

		System.out.println("������� �������������� �������� ");
		b = sc.nextInt();

		System.out.println("������� �������������� �������� ");
		c = sc.nextInt();

		System.out.println("������� �������������� �������� ");
		d = sc.nextInt();

		result = ((a / c) * (b / d)) - ((a * b - c) / c * d);

		System.out.println("�������� ��������� = " + result);
	}

}
