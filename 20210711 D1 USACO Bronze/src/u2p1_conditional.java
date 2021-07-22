
/*
 * ex 1, count leap years
 */
import java.util.Scanner;
public class u2p1_conditional {

	public static void main(String[] args) {
		//conditional: if, else if, switch case, nested
		Scanner kb = new Scanner(System.in);
		int count = 0;
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		kb.close();
		for (int x = n1; x <= n2; x++) {
			if (x % 4 == 0) {
				if (x % 100 == 0) {
					if (x % 400 == 0) {
						count++;
					}
				} else {
					count++;

				}
			}
		}
		System.out.println(count);
	}
}
