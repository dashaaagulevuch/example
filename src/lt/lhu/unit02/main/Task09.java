package lt.lhu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		double fx;

		x = 6;

		if (x <= -3) {
			fx = 9;
		} else {
			fx = 1 / (Math.pow(x, 2) + 1);
		}
		System.out.println("F(x) = " + fx);
	}

}
