import java.util.Scanner;

class Shift1 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		
		Scanner sc=new Scanner(System.in);
		int a=1;
		
		while(a>0 || a<0){
			a=sc.nextInt();
			int b=a>>37;
			System.out.println(b);
			int c=a>>>37;
			System.out.println(c);
			
		}
	}
}
