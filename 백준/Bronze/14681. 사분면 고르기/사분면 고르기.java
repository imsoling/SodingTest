import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();

		if (-1000 <= x && x <= 1000 && x != 0 && 
				-1000 <= y && y <= 1000 && y != 0) {
			if (x > 0) {
				if (y > 0) {
					System.out.println(1);
				} else if (y < 0) {
					System.out.println(4);
				}
			} else if (x < 0){
				if (y > 0) {
					System.out.println(2);
				} else if (y < 0) {
					System.out.println(3);
				}
			}
		}
		
		scanner.close();
	}
}