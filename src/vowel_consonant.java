import java.util.Scanner;

public class vowel_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a single alphabet: ");
		char ch = s.next().charAt(0);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is a vowel");
		else
			System.out.println(ch + " is a consonant");
	}
}