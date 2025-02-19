import java.util.Scanner;

class Leapyearc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int year = sc.nextInt();
        sc.close();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("leap year");
            } else { // Century year, but not divisible by 400
                System.out.println("not a leap year");
            }
        } else if (year % 4 == 0) { // Not a century year, divisible by 4
            System.out.println("leap year");
        } else { // Not divisible by 4
            System.out.println("not a leap year");
        }
    }
}