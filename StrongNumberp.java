import java.util.Scanner;

public class StrongNumberp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range  : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        for (int i = start; i <= end; i++) {
            int count = 0;
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                temp /= 10;
                count++;
            }
            temp = i;
            while (i > 0) {
                int rem = temp % 10;
                int prod = (int) Math.pow(rem, count);
                sum += prod;
                temp /= 10;
            }
            if (sum == i)
                System.out.println(i);
        }

    }
}
