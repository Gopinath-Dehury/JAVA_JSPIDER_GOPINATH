public class Mulofdigitexcept0 {
    public static void main(String[] args) {
        int n=5024,mul=1,rem=1;
        while(n>0)
        {
           rem=n%10;
           if(rem!=0)
           mul=rem*mul;
           n/=10;


        }System.out.println(mul);
        
        
    }
}
