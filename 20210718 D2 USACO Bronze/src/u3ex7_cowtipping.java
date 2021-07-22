import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class u3ex7_cowtipping {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("cowtip.in"));
		PrintWriter out = new PrintWriter(new File("cowtip.out"));

		int N = in.nextInt(); // size of the grid
		int[][] grid = new int[N][N];
		for (int r = 0; r < N; r++) {
			String line = in.next();

			for (int c = 0; c < N; c++) {
				grid[r][c] = line.charAt(c) - '0';
			}
		}
		in.close();

		int count = 0; // # of flipping to change grid all to 0
		for (int r = N - 1; r >= 0; r--) {
			for (int c = N - 1; c >= 0; c--) {
				if (grid[r][c] == 1) {
					count++;

					// apply flipping from [0, r] x [0, c]
					for (int x = 0; x <= r; x++) {
						for (int y = 0; y <= c; y++) {
							grid[x][y] = 1 - grid[x][y];
						}
					}
				}
			}
		}
		out.println(count);
		out.close();
	}
}