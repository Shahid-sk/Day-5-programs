import java.util.Scanner;
import java.lang.Math;

public class powoftwo {
	public static void main(String[] args) {
		int i, n;
		System.out.println("Enter n value");
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			for (i = 1; i <= n; i++) {
				int result = (int) Math.pow(2, i);
				System.out.println("result is " + result);
			}
		}

	}
}