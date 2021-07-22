
/*
 * delete duplicates in an array
 */
import java.util.ArrayList;
import java.util.Scanner;

public class u4p2_duplicates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> L = new ArrayList<>();

		for (int j = 0; j < N; j++) {
			int x = in.nextInt();
			if (!L.contains(x)) {
				L.add(x); // append x to the end if it isn't a duplicate
			}
		}
		System.out.println(L);
		in.close();
	}

}
