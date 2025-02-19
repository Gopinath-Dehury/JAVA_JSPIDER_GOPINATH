class Practice 
{
	public static void main(String[] args) 
	{
		int start=1;
		for(int i=1;i<=5;i++){
			
			if(i%2!=0){
				for(int j=0;j<=5;j++){
					System.out.print(start+j+" ");
				}
				start+=5;
			}else{
				start+=5;
				for(int j=start-1;j>=start-5;j--){
			        System.out.print(j+" ");

				}
			}
			
			
			System.out.println();
		}
		
		
		
	}
}


//  for(int j =10;j>=6;j--){
//	System.out.print(j+" ");   //10 9 8 7 6 5 4 3 2 1
//  }