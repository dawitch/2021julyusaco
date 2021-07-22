/*
 * Not Last (Jan 2017), finding the second to last milk-producing cow
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class notLast {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(new File("notlast.in"));
		PrintWriter out = new PrintWriter(new File("notlast.out"));

		String[] names = { "Bessie", "Elsie", "Gertie", "Annabelle", "Henrietta", "Maggie", "Daisy" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(names));
		int[] milk = new int[7];

		int N = in.nextInt(); // # of records
		for (int j = 0; j < N; j++) {
			String a = in.next(); // cow name
			int b = in.nextInt(); // milk

			int id = list.indexOf(a);
			milk[id] += b;
		}
		in.close();

		// find the smallest milk production
		int min1 = Integer.MAX_VALUE;
		for (int x = 0; x < 7; x++) {
			min1 = Math.min(min1, milk[x]);
		}

		// find the 2nd smallest milk production
		int min2 = Integer.MAX_VALUE;
		for (int x = 0; x < 7; x++) {
			if (milk[x] > min1 && milk[x] < min2) {
				min2 = milk[x];
			}
		}

		// count # of cows with the 2nd smallest milk production
		int count = 0;
		int uniqueID = -1; // the unique ID of the cow with the 2nd smallest milk
		for (int x = 0; x < 7; x++) {
			if (milk[x] == min2) {
				count++;
				uniqueID = x;
			}
		}

		if (count != 1) {
			out.println("Tie");
		} else { // count==1
			out.println(list.get(uniqueID));
		}
		out.close();
	}
}