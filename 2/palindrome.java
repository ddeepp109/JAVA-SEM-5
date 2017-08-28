import java.util.Scanner;
class palindrome {
	public static void main(String args[]) {
		System.out.println("Enter a Number:");
		Scanner s = new Scanner(System. in );
		int a = s.nextInt();
		int num = a,
		rev = 0,
		rem = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			rev = rev * 10 + rem;
		}
		if (rev == a) {
			System.out.println("Number is palindrome.");
		}
		else {
			System.out.println("Number is not palindrome.");
		}
	}
}