import java.util.Scanner;

class ArmStrongnumber {
    static boolean isArmStrong(int a) {
        int m = a, sum = 0;
        while (a > 0) {
            int rem = a % 10;
            int fact = 1;
            while (rem > 0) {
                fact *= rem;
                rem--;
            }
            sum += fact;
            a /= 10;
        }
        if (sum == m)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start range :");
        int start = sc.nextInt();
        System.out.println("enter end range :");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isArmStrong(i))
                System.out.println(i);
        }

    }
}