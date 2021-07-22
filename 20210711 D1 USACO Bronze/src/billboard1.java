
/*
 * list use
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class billboard1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new File("billboard.in"));
		PrintWriter out = new PrintWriter(new File("billboard.out"));

		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();

		int x3 = in.nextInt();
		int y3 = in.nextInt();
		int x4 = in.nextInt();
		int y4 = in.nextInt();

		int x5 = in.nextInt();
		int y5 = in.nextInt();
		int x6 = in.nextInt();
		int y6 = in.nextInt();
		in.close();

		// find the area of R1\T by R - area of R1 ^ T
		int ox = Math.max(0, Math.min(x2, x6) - Math.max(x1, x5));
		int oy = Math.max(0, Math.min(y2, y6) - Math.max(y1, y5));
		int a1 = (x2 - x1) * (y2 - y1) - ox * oy;

		// find the area of R2\T by R - area of R2 ^ T
		ox = Math.max(0, Math.min(x4, x6) - Math.max(x3, x5));
		oy = Math.max(0, Math.min(y4, y6) - Math.max(y3, y5));
		int a2 = (x4 - x3) * (y4 - y3) - ox * oy;

		out.println(a1 + a2);
		out.close();
	}

}
