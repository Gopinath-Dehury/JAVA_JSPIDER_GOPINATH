import java.util.Scanner;

class SPYNUMber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the start range :");
        int start = sc.nextInt();
        System.out.println("ENter the end range : ");
        int end = sc.nextInt();
        sc.close();

        for (int i = start; i <= end; i++) {
            if (isSpyNumber(i)) {
                System.out.println(i);
            }

        }

    }

    static boolean isSpyNumber(int a) {
        int mul = 1;
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            sum += rem;
            mul *= rem;
            a /= 10;
        }
        if (mul == sum) {
            return true;
        } else {
            return false;
        }
    }
}
