import java.util.Scanner;

public class ArrayProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer a = scan.nextInt();
		Integer b = scan.nextInt();

		a ^= b;
		b ^= a;
		a ^= b;
		
		System.out.println(a+" "+ b);
	}

}
