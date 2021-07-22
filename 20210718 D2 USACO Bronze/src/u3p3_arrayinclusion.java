
/*
 * find if all the elements in B appear in array A
 */
import java.util.Scanner;

public class u3p3_arrayinclusion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // # of integers in A
		int M = in.nextInt(); // # of integers in B

		int[] A = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = in.nextInt();
		}

		int[] B = new int[M];
		for (int k = 0; k < N; k++) {
			A[k] = in.nextInt();
		}
		in.close();

		int x = 0, y = 0;
		boolean valid = true;
		while (x < N && y < M) {
			// compare A[x] and B[y]
			if (A[x] < B[y]) {
				x++;
			} else if (A[x] > B[y]) {
				valid = false;
				break;
			} else {
				x++;
				y++;
			}
		}
		System.out.println(valid);
	}

}
