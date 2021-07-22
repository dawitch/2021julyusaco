/*
 * find the maximum sum of the last 4 digits of powers of 3
 */
public class u1p4_ex3powers3 {

	public static void main(String[] args) {
		int sum1 = 0;
		int ym = 0;
		for (int pow = 0; pow <= 1000; pow++) {
			long n = (long) Math.pow(3, pow);
			int m = (int) n % 10000;
			int one = m % 10;
			int ten = m / 10 % 10;
			int hun = m / 100 % 10;
			int tho = m / 1000 % 10;
			sum1 = one + ten + hun + tho;
			if (sum1 > ym) {
				ym = sum1;
			}

		}
		System.out.println(ym);

		//other approach
		int maxSum = 1; //of the last 4 digits
		int power = 1;
		for(int n=1; n<=1000; n++) {

			power = power * 3;
			power = power % 10000; // drop the multiples of 10000

			//find the sum of digits of 'power'
			int sum = power %10;
			sum += power /10 %10;
			sum += power /100 %10;
			sum += power /10000%10;
			if (sum > maxSum) {
			}
		}

	}
