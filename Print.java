import java.util.Scanner;

class Print {
	;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
		int n = sc.nextInt();
        sc.close();

		int spaces = 0;
		for (int i = n; i >= 1; i--) {

			for (int j = i; j >= 1; j--) {
				System.out.print("X" + " ");
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= spaces; j++) {
				System.out.print(" " + " ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("X" + " ");

			}
			System.out.println();
			spaces++;
		}

		for (int i = 1; i <= n; i++) {

			for (int j = i; j >= 1; j--) {
				System.out.print("X" + " ");
			}
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" " + " ");
			}
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" " + " ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print("X" + " ");
			}

			System.out.println();

		}
	}
}
