import java.util.ArrayList;
import java.util.Scanner;
public class gameScore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(); // #of rounds
		int M = in.nextInt(); // # of possible scored in each round

		int[] S = new int[M];
		for (int j = 0; j < M; j++) {
			S[j] = in.nextInt();
		}
		in.close();

		// find the number of distinct total scores after N rounds

		// all possible total scores in the previous round
		ArrayList<Integer> prev = new ArrayList<Integer>();
		for (int j = 0; j < M; j++) {
			prev.add(S[j]);
		}

		for (int r = 2; r <= N; r++) { // N-1 more rounds
			// all possible total scored after the current round
			ArrayList<Integer> curr = new ArrayList<>();

			// for(int score:prev) {
			for (int k = 0; k < prev.size(); k++) {
				int score = prev.get(k);

				for (int j = 0; j < M; j++) {
					if (!curr.contains(score + S[j])) {
						curr.add(score + S[j]);

					}
				}

			}
			prev = curr; // the list 'prev' takes the address of 'curr'
			// doesn't copy and past the elements over!!
		}
		System.out.println(prev.size());
	}

}
