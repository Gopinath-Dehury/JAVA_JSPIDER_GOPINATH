import java.util.Scanner;
class Sumbecome1digit 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=n;){
			
			int rem=n%10;
			sum+=rem;
				n/=10;
			if(n==0 && sum>9){
				System.out.println(sum);
				n=sum;
				sum=0;
			}
		
		
		}	
		System.out.println(sum);
	}
}
