
/*
 *
 */
import java.util.Scanner;

public class u3p4_countclumps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // #of integers
		int[] A = new int[N];
		for (int j = 0; j < N; j++) {
			A[j] = in.nextInt();
		}
		in.close();

		// count the # of clumps
		int count = 0;
		int j = 0;
		while (j < N) {
			// find the first k so that A[j] - A[j+1] = ... = A[k-1] != A[k]
			int k = j + 1;
			while (k < N && A[k] == A[j]) {
				k++;
			}

			if (k > j + 1) {
				count++; // at least two integers same as A[j]
			}

			j = k; //// A[k] will be the first integer of the next clump/block

		}
		System.out.println(count);
	}

}
