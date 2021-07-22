import java.util.ArrayList;
import java.util.Scanner;

public class u4p1_complementary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt(); // left end of the interval
		int B = in.nextInt(); // right end

		int N = in.nextInt(); // # of integers in S
		int[] S = new int[N];
		for (int j = 0; j < N; j++) {
			S[j] = in.nextInt();
		}
		in.close();

		// find the integers in [A,B] but not in S
		ArrayList<Integer> cs = new ArrayList<Integer>(B - A + 1);
		for (int x = A; x <= B; x++) {
			if (!cs.contains(x)) {
				cs.add(x);
			}
		}
		System.out.println(cs);
	}

}
