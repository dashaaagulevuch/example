package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;

		a = 7;
		b = -5;
		c = 6;

		if (a > 0) {
			a = Math.pow(a, 2);
		} else {
			if (a < 0)
				a = Math.pow(a, 4);
		}

		if (b > 0) {
			b = Math.pow(b, 2);
		} else {
			if (b < 0)
				b = Math.pow(b, 4);
		}

		if (c > 0) {
			c = Math.pow(c, 2);
		} else {
			if (c < 0)
				c = Math.pow(c, 4);
		}

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

	}

}
