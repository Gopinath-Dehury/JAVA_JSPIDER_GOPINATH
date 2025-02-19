import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  numbers :");
        long n = sc.nextLong();
        sc.close();

        long sqr = n * n;
        long l = 1000000000000000000L;
        boolean flag = false;
        for (long i = 10; i < l; i *= 10) {
            long rem = sqr % i;

            // int last2digits=sqr%100;
            // int last3digits=sqr%1000;
            // int last4digits=sqr%10000;
            // int last5digits=sqr%100000;
            // ||n==last2digits ||n==last3digits ||n==last4digits||n==last5digits
            if (n == rem) {
                flag = true;
                // System.out.println("it is a automorphic number");
                break;
            }

        }
        if (flag)
            System.out.println("it is a automorphic number");
        else
            System.out.println("not automorphic");

    }
}
