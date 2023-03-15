/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int num=in.nextInt();
		int rem,sum=0;
		int num1=num;
		do{
                 rem=num1%10;
                 rem=rem*rem*rem;
                 sum=sum+rem;
                 num1=num1/10;
		}while(num1>0);

		if (sum==num) {
		 	System.out.print(num+" is Amstrong Number");
		}else {
		 	System.out.print(num+" is not Amstrong Number ");
		}
	    
	}
    
}
