import java.util.Scanner;

class SumOfDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		sc.close();

		String numbers="";
		int sum=0;
		while(n>0){
		int rem=n%10;
		sum+=rem;//it collect the unit digit and add with sum add then assign to sum integer
		numbers=rem+numbers;
		
		n/=10;//it delete the last delete by dividing the n value with 10 and then assign the cureent value to n again so that the last digit will be deleted and n will be remaining
		if(n!=0)
			numbers="+"+numbers;
		}

		System.out.println(numbers+"="+sum);
		
		
	}
}
