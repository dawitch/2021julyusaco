
/*
 * Two indices for abc_x and def_y, as in the merge part in merge sort.
 * The complexity: O(n)
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class base4demovs {

	public static void main(String[] args) throws IOException {
		// read input
		Scanner in = new Scanner(new File("whatbase.in"));
		PrintWriter out = new PrintWriter("whatbase.out");

		int K = in.nextInt();

		// process each line
		for (int i = 0; i < K; i++) {
			int n1 = in.nextInt();
			int n2 = in.nextInt();

			int a = n1 / 100;
			int b = (n1 / 10) % 10;
			int c = n1 % 10;

			int d = n2 / 100;
			int e = (n2 / 10) % 10;
			int f = n2 % 10;

			// find the right x & y for abc and def
			int x = 10, y = 10;
			while (x <= 15000 && y <= 15000) {

				int Nx = a * x * x + b * x + c;
				int Ny = d * y * y + e * y + f;

				if (Nx < Ny) {
					x++;
				} else if (Nx > Ny) {
					y++;
				} else {
					out.println(x + " " + y);
					break;
				}
			}
		}

		in.close();
		out.close();
	}
}