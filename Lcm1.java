import java.util.Scanner;

public class Lcm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a");
        int a = sc.nextInt();
        System.out.println("Enter the number b");
        int b = sc.nextInt();
        int i = 2;
        sc.close();

        while (true) {

            if (i % a == 0 && i % b == 0) {
                System.out.println(i);
                break;

            }
            i++;
        }

    }

}
