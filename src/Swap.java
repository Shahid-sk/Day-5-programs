import java.util.*;

class Swap {
	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
		System.out.println("Before swapping \n a value is " + a + "\n b value is " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping \n a value is " + a + "\n b value is " + b);
		System.out.println();
	}
}