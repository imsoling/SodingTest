import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
		scanner.close();
		
	}

}