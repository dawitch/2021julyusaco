import java.util.ArrayList;
import java.util.Scanner;
public class newcomf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int number_cow = in.nextInt();
		int thing1 = 0;
		int thing2 = 0;
		int checkamount = 0;
		int count = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		ArrayList<Integer> x = new ArrayList<Integer>();
		ArrayList<Integer> y = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			thing1 = in.nextInt();
			x.add(thing1);
			thing2 = in.nextInt();
			y.add(thing2);
			System.out.println(0);
		}
		for (int i = 0; i < number_cow - 3; i++) {
			thing1 = in.nextInt();
			x.add(thing1);
			thing2 = in.nextInt();
			y.add(thing2);
			for (int j = 0; j < x.size(); j++) {
				a = x.get(j);
				b = y.get(j);
				for (int k = 0; k < x.size(); j++) {
					c = x.get(k);
					d = y.get(k);
					if (c == a + 1 && d == b + 1 || c == a - 1 && d == b + 1 || c == a - 1 && d == b - 1
							|| c == a + 1 && d == b - 1) {
						checkamount++;
					}
				}
				if (checkamount == 3) {
					count++;
					checkamount = 0;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
}