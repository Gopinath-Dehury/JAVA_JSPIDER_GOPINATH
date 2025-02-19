import java.util.Scanner;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        // int count = 1;
        for (int i = end; i >= start; i--) {// and set the 1st loop start from the last (big) number for getting biggest
                                            // prime number of that range
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (i > 1 && flag) {// && count <= 3
                System.out.print(i + " ");
                break;// just use a break for printing 1st number of a series range given by user
                // count++;
            }

        }

    }
}
