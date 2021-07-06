import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		int dividend, divisor;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter dividend value");
		dividend = sc.nextInt();
		System.out.println("enter divisor value");
		divisor = sc.nextInt();
		sc.close();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}