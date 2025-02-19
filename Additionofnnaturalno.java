import java.util.Scanner;

public class Additionofnnaturalno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        sc.close();
        int sum = 0;
        while (n > 0) {
            System.out.println();
            if (n > 1)
                System.out.print(" + ");
            sum += n;
            n--;
        }
        System.out.println(" = " + sum);
    }
}
