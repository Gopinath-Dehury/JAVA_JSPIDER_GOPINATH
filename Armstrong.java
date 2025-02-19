import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        int sum = 0;

        while (temp > 0) {
            temp /= 10;
            count++;
        }
        sc.close();
        temp = num;
        while (temp > 0) {
            int rem = temp % 10;
            int prod = (int) Math.pow(rem, count);
            sum += prod;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println("armstrong");
        } else {
            System.out.println("not arm strong");
        }

    }
}
