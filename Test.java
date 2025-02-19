import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  numbers 1:");
        int a = sc.nextInt();
        System.out.println("Enter  numbers 2 :");

        int b = sc.nextInt();
        sc.close();
        // int lcm = 1;
        int mulA = a;
        int mulB = b;

        for (int i = 1; i <= b; i++) {
            mulA = a * i;
            // if (i == 1)
            // System.out.println("multiple of" + a);
            // System.out.print(mulA + " ,");

            // System.out.println("\n");
            for (int j = 1; j <= a; j++) {
                if (mulA == mulB) {
                    // System.out.println(mulA);
                    break;
                }
                mulB = b * j;
                // if (j == 1)
                // System.out.println("multiple of " + b);

                // System.out.print(mulB + " ,");

            }
            if (mulA == mulB) {
                System.out.println("The lcm of " + a + " & " + b + " is " + mulA);
                break;
            }

        }

        // System.out.println("Lcm of " + a + " and " + b + " is " + lcm);

    }
}