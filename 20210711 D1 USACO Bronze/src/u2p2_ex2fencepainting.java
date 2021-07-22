import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class u2p2_ex2fencepainting {

	public static void main(String[] args) throws Exception {
		// Fence Painting Problem
		Scanner in = new Scanner(new File("paint.in"));
		PrintWriter out = new PrintWriter(new File("paint.out"));

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();

		//		int ans = 0;
		//		if (a < c) {
		//			if (b < c) {
		//				ans = b - a + d - c;
		//			} else if (b < d) {
		//				ans = d - a;
		//			} else {
		//				ans = b - a;
		//			}
		//		} else if (a < d) {
		//			if (b < d) {
		//				ans = d - c;
		//			} else {
		//				ans = b - c;
		//			}
		//		} else {
		//			ans = b - a + d - c;
		//		}

		int ans = b - a + d - c - Math.max(0, Math.min(b, d) - Math.max(a, c));
		out.println(ans);
		out.close();


	}

}
