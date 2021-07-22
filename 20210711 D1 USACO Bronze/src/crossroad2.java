
/*
 * pracprob_CowsCrossRoadI : Why Does the Cow Cross the Road
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class crossroad2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("crossroad.in"));
		PrintWriter out = new PrintWriter(new File("crossroad.out"));
		int N = in.nextInt();
		int[][] sides = new int[N][2];

		for (int j = 0; j < N; j++) {
			sides[j][0] = in.nextInt(); // cow ID
			sides[j][1] = in.nextInt(); // side

		}
		in.close();

		// count the confirmed cow crossings
		int count = 0;

		int[] last = new int[11];
		Arrays.fill(last, -1); // for all cows, we haven't seen them yet

		for (int j = 0; j < N; j++) {
			int ID = sides[j][0];
			if (last[ID] != -1 && sides[j][1] != last[ID]) {
				count++;
			}
			last[ID] = sides[j][1]; // update the last side we saw cow ID

		}
		out.println(count);
		out.close();
	}

}
