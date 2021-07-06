import java.util.Scanner;

public class Largest_three {

	public static void main(String args[]) {
		int n1, n2, n3;
		System.out.println("Enter three integers: ");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		sc.close();
		if (n1 > n2 && n1 > n3)
			System.out.println("The largest number is n1: " + n1);
		else if (n2 > n1 && n2 > n3)
			System.out.println("The largest number is n2: " + n2);
		else if (n3 > n1 && n3 > n2)
			System.out.println("The largest number is n3: " + n3);
		else
			System.out.println("The numbers are same.");
	}
}