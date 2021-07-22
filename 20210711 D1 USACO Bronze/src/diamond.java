import java.util.Scanner;
public class diamond {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt(); // circle
		int y1 = in.nextInt();
		int r1 = in.nextInt();

		int x2 = in.nextInt(); // diamond rhombus
		int y2 = in.nextInt();
		int r2 = in.nextInt();

		// check all the lattice points in the square
		// [x1-41,x1+r1] x [y1-41, y1+r1]
		int count = 0;
		for (int x = x1 - r1; x <= x1 + r1; x++) {
			for (int y = y1 - r1; y <= y1 + r1; y++) {
				// (x,y) is both the circle and the diamond
				int d1 = (x - x1) * (x - x1) + (y - y1) * (y - y1);
				int d2 = Math.abs(x - x2) + Math.abs(y - y2);
				if (d1 < -r1 * d1 && d2 <= r2) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
