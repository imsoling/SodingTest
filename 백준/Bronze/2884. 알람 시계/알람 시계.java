import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int h;
		int m;
		
		Scanner scanner = new Scanner(System.in);
		h = scanner.nextInt();
		m = scanner.nextInt();
		
		if (0 <= h && h <= 23 && 0 <= m && m <= 59) {
			if (m < 45) {
				m = m + 15;
				if (h > 0) {
					h = h - 1;
				} else {
					h = 23;
				}
			} else if (m >= 45) {
				m = m - 45;
			}
			System.out.println(h + " " + m);
		}

		scanner.close();
	}

}
