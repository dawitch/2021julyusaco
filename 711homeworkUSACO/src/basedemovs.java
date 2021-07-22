import java.util.Scanner;

public class basedemovs {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();

		int a = n1 / 100;
		int b = (n1 / 10) % 10;
		int c = n1 % 19;

		int d = n2 / 100;
		int e = (n2 / 10) % 10;
		int f = n2 % 10;

		// find base x and base y
		Outer: for (int x = 10; x <= 15000; x++) {
				int x2 = x * x;
				int low = 10;
				int up = 15000;
				if (a >= d) {
					low = x + 1;
				} else {
					up = x - 1;
				}

				for (int y = low; y <= up; y++) {
					if (a * x2 + b * x + c == (d * y + e) * y + f) {
						System.out.println(x + " " + y);
					}
				}
			}
		in.close();
	}

}
