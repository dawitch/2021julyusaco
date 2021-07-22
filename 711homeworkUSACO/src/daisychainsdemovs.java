
/*
 * Flowers(USACO Dec 2020)
 */
import java.util.Scanner;
public class daisychainsdemovs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();// # of flowers
		int[] A = new int[n];
		for (int j = 0; j < n; j++) {
			A[j] = in.nextInt();
		}
		int count = n;// each flower by itself has an average flower
		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {
				int sum = 0; // n sum between[j,k]
				for (int x = j; x <= k; x++) {
					sum += A[x];
				}
				for (int x = j; x <= k; x++) {// [j,k] has an average flower
					if (sum == A[x] * (k - j + 1)) {// different from A[k]==sum/k-j+1
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
		in.close();
	}
}