/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner( System.in);
	    int rev=0,no,rem;
	    System.out.println("Enter any No: ");
	    no=sc.nextInt();
	    while(no>0){
	        rem=no%10;
	        rev=rev*10+rem;
	        no=no/10;
	    }
	       System.out.println("reverse no is:"+rev);
	    }
	}

