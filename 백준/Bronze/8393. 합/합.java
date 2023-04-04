import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		scanner.close();
	}

}
