class Print3 
{
	public static void main(String[] args) 
	{
		char c='A';
		for(int i=1;i<=5;i++){
			
			for(int j=4;j>=i;j--){// inner 1st loop
			System.out.print(c+" ");//it is for printing char
			c++;
			
			}
			
			for(int k=1;k<=i;k++){// inner 2nd loop
				System.out.print("*"+" ");//it is for printing star
		  }
			System.out.println();
		}//first for loop
	}
}
