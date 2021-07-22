import java.util.Scanner;

public class u3p4_clumpsvs2 {

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
		for (int j = 1; j < N; j++) {
			if (A[j] == A[j - 1] && (j == 1 || A[j] != A[j - 2])) {
				count++;
			}

		}
		System.out.println(count);
	}

}