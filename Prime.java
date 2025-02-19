import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        //int n = 79;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a new number to check whether it is prime or not :  ");
        int n= read.nextInt();
        read.close();
        if (IsPrime(n)) {
            System.out.println(n + " is prime number .");
        } else {
            System.out.println(n + " is a not a prime number .");
        }
    }

    public static boolean IsPrime(int n) {
        int count = 0;
        if (n <= 1) {
            // System.out.println("not a prime");
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
                return false;

            }
        }
        if (count == 2)
            return true;

        return true;
    }
}