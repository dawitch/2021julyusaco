
//Team Tic Tac Toe (Mar 2018)
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class u3ex8_TicTac {

	public static void main(String[] args) throws Exception {
		// create array with all 9 spaces
		// approach 1 - many ifs for each position
		// approach 2 - creating separate "sub-array/arraylist" and looping through
		// array, count, for loop ++3, run through the same for each

		Scanner in = new Scanner(new File("tttt.in"));
		PrintWriter out = new PrintWriter(new File("tttt.out"));
		char[] A = new char[9];
		String string = in.next();
		String string1 = in.next();
		String string2 = in.next();
		A[0] = string.charAt(0);
		A[1] = string.charAt(1);
		A[2] = string.charAt(2);
		A[3] = string1.charAt(0);
		A[4] = string1.charAt(1);
		A[5] = string1.charAt(2);
		A[6] = string2.charAt(0);
		A[7] = string2.charAt(1);
		A[8] = string2.charAt(2);
		// System.out.println(A);

		// loop possibilities
		int count = 0;
		int tcount = 0;
		for (int x = 0; x < 9; x = x + 3) {
			if (A[x] == A[x + 1] && A[x + 1] == A[x + 2]) {
				count++;
			} else if (A[x] == A[x + 1] || A[x + 1] == A[x + 2] || A[x + 2] == A[x]) {
				tcount++;
			}
		}
		for (int y = 0; y < 3; y = y + 1) {
			if (A[y] == A[y + 3] && A[y + 3] == A[y + 6]) {
				count++;
			} else if (A[y] == A[y + 3] || A[y + 3] == A[y + 6] || A[y + 6] == A[y]) {
				tcount++;
			}
		}
		// diagonals
		if (A[0] == A[4] && A[4] == A[8]) {
			count++;
		} else if (A[0] == A[4] || A[4] == A[8] || A[8] == A[0]) {
			tcount++;
		}
		if (A[2] == A[4] && A[4] == A[6]) {
			count++;
		} else if (A[2] == A[4] || A[4] == A[6] || A[6] == A[2]) {
			tcount++;
		}

		out.println(count);
		out.println(tcount);
		out.close();
	}

}

