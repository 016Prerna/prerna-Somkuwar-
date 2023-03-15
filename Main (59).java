/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter any number: ");
		int no=in.nextInt();
		int rem,rev=0;
		int no1=no;
		do{
                rem=no1%10;
                rev=rev*10+rem;
                no1=no1/10;
		}while(no1>0);

		if (rev==no) {
		 	System.out.print(no+" is Palindrome Number ");
		}else {
		 	System.out.print(no+" is not Palindrome Number ");
		}
	}
}
