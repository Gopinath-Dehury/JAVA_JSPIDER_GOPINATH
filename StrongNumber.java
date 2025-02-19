//Strong number is a number  where the sum of their digits  factorials is equals to that number
// ex -- 145   
// 1!=1    5!=5*4*3*2*1=120   4!=4*3*2*1=24
//120
// 24
//  1
//145


import java.util.Scanner;

class StrongNumber{

public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to check it is Strong number or not : ");
int n=sc.nextInt();
int m=n;
int sum=0;
sc.close();

while(n>0){
int rem=n%10;
int fact=1;
System.out.println("Each Loot rem = "+rem);
for(int i=1;i<=rem;i++){
	
	fact=fact*i;
System.out.println("Each fact = "+fact);
	

	}
sum+=fact;
n/=10;
}
System.out.println("sum = "+sum);
System.out.println("Number = "+m);
if(sum==m){
System.out.println(m+" is a strong number.");
}else{
System.out.println(m+" is not a Strong number.");
}
   }
}