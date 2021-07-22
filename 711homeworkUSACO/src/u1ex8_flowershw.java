import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class u1ex8_flowershw {

	public static void main(String[] args) throws Exception {

		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[] p = new int[N];
		for (int x = 1; x <= N; x++) {
			p[x - 1] = kb.nextInt();
		}
		kb.close();
		int count = 0;
		//		int n = 0;
		int ad = 0;
		double avg = 0;
		boolean test = false;
		//		System.out.println(p[3]);

		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				if (i == j) {
					count++;
					//					System.out.print(i);
					//					System.out.println(j);
				} else {
					int[] ps = Arrays.copyOfRange(p, i - 1, j);
					ad = IntStream.of(ps).sum();
					test = false;
					avg = (double) ad / (j - i + 1);
					//					System.out.println(avg);

					for (double element : p) {
						if (element == avg) {
							test = true;
						}
					}
					if (test == true) {
						count++;
						//						System.out.print(i);
						//						System.out.println(j);
					}

				}
			}
		}
		System.out.println(count);
	}

}


