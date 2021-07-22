
//find the highest frequency of any integer appeared in array A, with n integers.
// input: n
//        array
import java.util.ArrayList;
import java.util.Scanner;

public class u3ex5_arrayFrequency {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for (int j = 0; j < n; j++) {
			A[j] = in.nextInt();
		}
		in.close();

		//calculating the highest frequency in A
		int count = 0;
		int curcount = 0;
		int element = 0;
		ArrayList<Integer> U = new ArrayList<>();

		for (int j = 0; j < n; j++) { //creates an Arraylist of only unique values
			int x = A[j];
			if (!U.contains(x)) {
				U.add(x);
			}
		}

		for (int x = 0; x < U.size(); x++) {
			curcount = 0;
			for (int y = 0; y < n; y++) {
				element = U.get(x);
				if (element == A[y]) {
					curcount++;

				}
			}
			if (curcount > count) {
				count = curcount;
			}
		}
		System.out.println(count);
	}

}
