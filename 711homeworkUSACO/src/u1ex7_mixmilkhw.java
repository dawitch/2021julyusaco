import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class u1ex7_mixmilkhw {
	public static void main(String[] args) throws Exception {

		Scanner in = new Scanner(new File("mixmilk.in"));
		PrintWriter out = new PrintWriter(new File("mixmilk.out"));
		int amax = in.nextInt();
		int a = in.nextInt();
		int bmax = in.nextInt();
		int b = in.nextInt();
		int cmax = in.nextInt();
		int c = in.nextInt();
		in.close();
		for (int x = 1; x <= 100; x++) {
			if(x%3 == 1) {
				b = a+b;
				if(bmax>=b) {
					a = 0;
				}
				else {
					a=b-bmax;
					b=bmax;
				}
			}
			if(x%3 == 2) {
				c = b+c;
				if(cmax>=c) {
					b = 0;
				}
				else {
					b=c-cmax;
					c=cmax;
				}
			}
			if(x%3 == 0) {
				a = c+a;
				if(amax>=a) {
					c = 0;
				}
				else {
					c=a-amax;
					a=amax;
				}
			}
		}

		out.println(a);
		out.println(b);
		out.println(c);
		out.close();
		//		System.out.println(a);
		//		System.out.println(b);
		//		System.out.println(c);
	}
}