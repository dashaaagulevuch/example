package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc;
		int a;
		int b;

		int Summa;

		sc = new Scanner(System.in);

		System.out.println("������� ����� ����� ");
		a = sc.nextInt();

		System.out.println("������� ����� ����� ");
		b = sc.nextInt();

		Summa = a + b;

		System.out.println("����� = " + Summa);
	}
}
