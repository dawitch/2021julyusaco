import java.util.ArrayList;
import java.util.Scanner;
public class u4p22_arraylistfix12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // # of integers
		ArrayList<Integer> A = new ArrayList<>();
		int[] B = new int[N]; // final ans, keeping it in the original order
		for (int j = 0; j < N; j++) {
			int x = in.nextInt();
			if (x != 2) {
				A.add(x);
			} else if (x == 1) {
				B[j] = 1;
			}
			B[j + 1] = 2;
		}
		in.close();

		// insert the integers not 1 not 2 to B
		for (int j = 0; j < N; j++) {
			if (B[j] == -1) {
				B[j] = A.remove(0);
			}
		}
		for (int j = 0; j < A.size(); j++) {
			System.out.println(A.get(j) + " ");
		}
	}
}