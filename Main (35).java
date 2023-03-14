/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter first no: ");
	    int a=in.nextInt();
	    System.out.print("Enter second no: ");
	    int b=in.nextInt();
	    System.out.print("Enter third no: ");
	    int c=in.nextInt();
	    System.out.print("Enter forth no: ");
	    int d=in.nextInt();
	    int small=0;
	    if(a<b) {
	        if(a<c) {
	            if(a<d) {
	            small=a;
	            }
	            else{
	            small=d;
	            }
	    }
	}
	    if(b<a){
	        if(b<c){
	            if(b<a){
	            small=b;
	            } 
	            else{
	            small=d;
	            }
	    }
	}
	    if(c<a){
	        if(c<b){
	            if(c<d){
	            small=c;
	            }
	            else{
	            small=b;
	        }
	    }
	 }
	System.out.println("The smallest no is: "+small);
	}
}
