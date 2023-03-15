/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
 public class Main{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Any Number: ");
		int no=in.nextInt();
		int count=0;
		  while (no>0) {
		  	    no=no/10;
		  	    ++count;
		  }
	System.out.print("The Number of Digits are: "+count);
	}
     
 }