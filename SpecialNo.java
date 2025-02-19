import java.util.Scanner;

public class SpecialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter :");
        int n = sc.nextInt();
        sc.close();       int temp = n;
        int sum = 0;
        int mul = 1;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + rem;
            mul = mul * rem;
            temp /= 10;
        }

        int Totalsum = sum + mul;
        if (Totalsum == n) {
            System.out.println(n + " is a special number.");
        } else {
            System.out.println(n + " is not a special number.");
        }

    }

}
