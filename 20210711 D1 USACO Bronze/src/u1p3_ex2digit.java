import java.util.Scanner;

/*
 * how many times the digit 3 shows up between int L and R
 */
public class u1p3_ex2digit {

	public static void main(String[] args) {
		System.out.println("Enter 2 integers: ");
		Scanner in = new Scanner(System.in);
		int L = in.nextInt();
		int R = in.nextInt();
		// count the # of times 3 shows up
		int count = 0;
		for (int n = L; n <= R; n++) {
			int x = n;
			while (x > 0) {
				int ones = x % 10;
				if (ones == 3) {
					count++;
				}
				x = x / 10;
			}
		}
		System.out.println(count);
		in.close();
	}

}
