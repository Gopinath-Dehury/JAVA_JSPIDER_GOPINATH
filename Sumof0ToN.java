import java.util.Scanner;

class Sumof0ToN 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the natural number :");
		int n=sc.nextInt();
		
		int sum=0;
		String s="";
		for(int i=1;i<=n;i++){
			
			sum+=i;
			
			s=s+i;
			if(i<n)
				s=s+"+";
		
		}
		System.out.println(s+"="+sum);
			
	}
}
