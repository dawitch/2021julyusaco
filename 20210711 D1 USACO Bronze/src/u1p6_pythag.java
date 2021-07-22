
/*
 * modified pythagorean: 2a^2+b^2=c^2
 */
import java.util.Scanner;
public class u1p6_pythag {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // upper bound
		in.close();

		// find all the pythagorean triples
		long t1 = System.currentTimeMillis();
		int count = 0;
		for (int a = 1; a <= n; a++) {
			for (int b = a; b <= n; b++) {
				for (int c = b; c <= n; c++) {
					if (a * a * 2 + b * b == c * c) {
						// System.out.println(a + " " + b + " " + c);
						count++;
					}
				}
			}
		}
		System.out.println(count);

		// approach 2 -- without c layer
		long t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
		count = 0;
		for (int a = 1; a <= n; a++) {
			for (int b = a; b <= n; b++) {
				int L = 2 * a * a + b * b;
				int rt = (int) Math.sqrt(L);
				if (rt <= n && rt * rt == L) {
					count++;
				}
			}
		}
		System.out.println(count);
		long t3 = System.currentTimeMillis();
		System.out.println(t3 - t2);
	}

}
