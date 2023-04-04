import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a * (b%10));
		System.out.println(a * ((b%100)/10));
		System.out.println(a * (b/100));
		System.out.println((a * (b%10)) + ((a * ((b%100)/10))*10) + ((a * (b/100))*100));
		
		scanner.close();
		
	}

}