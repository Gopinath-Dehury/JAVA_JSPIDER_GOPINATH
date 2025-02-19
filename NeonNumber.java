import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        sc.close();
        int sqr = n * n;
        System.out.println(sqr);
        int sum = 0;
        while (sqr > 0) {
            int rem = sqr % 10;
            sum = sum + rem;
            sqr /= 10;

        }
        if (sum == n)
            System.out.println(n + " is a NEON number");
        else
            System.out.println(n + " is not a NEON number");

    }
}
