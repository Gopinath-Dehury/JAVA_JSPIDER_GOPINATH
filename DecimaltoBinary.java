import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Range : ");
        int n = sc.nextInt();
        // int n = 25;
        int bin = 0;
        int i = 1;
        // String s = "";
        while (n > 0) {
            int bit = n % 2;
            bin = bit * i + bin;//this will add the bit in right places with loop value of i
            n /= 2;
            i *= 10;
        }
        System.out.println(bin);
    }
}
