/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int num=in.nextInt();
		int res=1,rem;
		  while (num>0) {
		  	 rem=num%10;
                         res=res*rem;
                         num=num/10;
		  }
	System.out.print("The Multiplication is "+res);
	}
}
