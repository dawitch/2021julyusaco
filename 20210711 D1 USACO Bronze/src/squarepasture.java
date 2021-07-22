
/*
 *
 */
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class squarepasture {

	public static void main(String[] args) throws Exception {
		// x-min x-max, y-min y- max, see which difference is larger for a square
		Scanner in = new Scanner(new File("square.in"));
		PrintWriter out = new PrintWriter(new File("square.out"));
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		int x3 = in.nextInt();
		int y3 = in.nextInt();
		int x4 = in.nextInt();
		int y4 = in.nextInt();
		in.close();

		int xmin = Math.min(x1, x3);
		int xmax = Math.max(x2, x4);
		int ymin = Math.min(y1, y3);
		int ymax = Math.max(y2, y4);

		int size = Math.max(xmax - xmin, ymax - ymin);
		out.println(size * size);
		out.close();

	}

}
