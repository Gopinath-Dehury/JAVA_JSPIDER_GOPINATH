import java.util.Scanner;

public class B2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int bin = sc.nextInt();
        int dec = 0;
        int i = 1;
        while (bin > 0) {
            int rem=(bin % 10);
            dec +=rem  * i;
            
            i *= 2;
            bin /= 10;
        }
        System.out.println(dec);
        sc.close();
    }
}
