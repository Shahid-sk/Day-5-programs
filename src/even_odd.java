import java.util.Scanner;

public class even_odd {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in)) {
			
			double n = sc.nextDouble();
			if (n % 2 == 0)
				System.out.println("number " + n + " is even");
			else
				System.out.println("number " + n + " is odd");
		}
	}
}
