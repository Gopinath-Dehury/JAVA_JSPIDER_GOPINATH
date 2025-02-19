import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = read.nextInt();
        // int count=0;
        if (CheckPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        read.close();
    }

    public static Boolean CheckPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;

    }

}