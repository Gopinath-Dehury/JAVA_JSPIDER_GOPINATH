import java.util.Scanner;

class PCN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no : ");
        int n= sc.nextInt();
        sc.close();
        if(IsPrime(n)){
            System.out.println(n +" is prime number.");
        }else{
            System.out.println(n+" is Composite number. ");
        }
    }

    public static boolean IsPrime(int n)
    {
        // if(n<=1){
        //     return false;
        // }
        for(int i=2;i<n;i++)
        {
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
}
