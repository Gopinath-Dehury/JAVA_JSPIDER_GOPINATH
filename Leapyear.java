import java.util.Scanner;

class Leapyear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int year = sc.nextInt();
        sc.close();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        // if (year % 100 == 0) {
        // if (year % 400 == 0) {
        // System.out.println("leap year");
        // }

        // }
        // if (year % 4 == 0 && year % 100 != 0) {
        // System.out.println("leap year");
        // } else if (year % 400 != 0) {
        // System.out.println("not a leap year");
        // }

    }
}
