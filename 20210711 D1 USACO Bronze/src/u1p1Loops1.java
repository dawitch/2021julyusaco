/*
 * Illustrates usage of "break and "continue" statements.
 */
public class u1p1Loops1 {

	public static void main(String[] args) {
		//loop types; for, while, do-while, nested w/ break and continue

		Houston:
			for (int k = 0; k < 5; k++) {
				System.out.print(k + ": ");
				for (int j = 1; j <= 10; j++) {
					if (j == 3) {
						continue; // skip the rest of the current iteration
					}

					System.out.print(j + " ");
					// if(j==3) break;
					if (j == 4) {
						break Houston;
					}
				}
				System.out.println();
			}
	}

}
