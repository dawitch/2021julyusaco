import java.util.ArrayList;
import java.util.Scanner;

//Weird Pascal's
public class u4ex5_Pascals {

	public static void main(String[] args) {
		// make an arraylist, with ab, add put in sum, new item, add, continue
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int n = in.nextInt();
		int sum = 0;
		int csum = 0;
		int addition = 0;
		int Asize = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(a);
		A.add(b);
		in.close();

		for (int x = 1; x <= n; x++) {
			csum = 0;
			if (A.size() == x + 1) {
				// System.out.println(A);
				for (int d : A) {
					csum += d;
				}
				sum += csum;
				continue;
			} else {
				Asize = A.size();
				for (int c = 0; c < Asize - 1; c++) {
					addition = A.get(c) + A.get(c + 1);
					A.add(addition);
				}
				for (int c = 1; c <= Asize - 1; c++) {
					A.remove(1);
				}
				A.add(b);
				// replacing middle one
				if (A.size() % 2 == 1) {
					A.set(A.size() / 2, A.get(A.size() / 2) / 2);
				}

				// System.out.println(A);
				for (int d : A) {
					csum += d;
				}
				sum += csum;
			}
		}
		System.out.println(sum);
	}

}
