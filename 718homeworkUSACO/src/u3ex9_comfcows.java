
//Comfortable cows (Feb 2021)
import java.util.Scanner;

public class u3ex9_comfcows {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] c = new int[1001][1001];
		int[] x = new int[N];
		int[] y = new int[N];
		int count = 0;

		for (int i = 0; i < 1001; i++) {
			for (int j = 0; j < 1001; j++) {
				c[i][j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();

		}
		in.close();
		for (int i = 0; i < N; i++) {
			count = 0;
			c[x[i]][y[i]] = 1;
			for (int j = 0; j <= i; j++) {
				// System.out.println(j);
				if (x[j] - 1 == -1) {
					if (c[x[j]][y[j] - 1] + c[x[j]][y[j] + 1] + c[x[j] + 1][y[j]] == 3) {
						count++;
					}

				}
				else if (y[j] - 1 == -1) {
					if (c[x[j] - 1][y[j]] + c[x[j]][y[j] + 1] + c[x[j] + 1][y[j]] == 3) {
						count++;
					}
				} else {
					if (c[x[j]][y[j] - 1] + c[x[j] - 1][y[j]] + c[x[j]][y[j] + 1] + c[x[j] + 1][y[j]] == 3) {
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}
