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
	    System.out.println("Enter day(sun/mon/tues/wed/thur/fri/sat): ");
	    String day=in.next();
	    switch(day) {
	            case "sun":
	                System.out.println(" Today is Sunday ");
	                break;
	            case"mon":
	                System.out.println("Today is Monday ");
	                break;
	            case"tues":
	                System.out.println("Today is Tuesday ");
	                break;
	            case"wed":
	                System.out.println("Today is Wednesday ");
	                break;
	            case "thur":
	                System.out.println("Today is Thursday ");
	                break;
	            case "fri":
	                System.out.println("Today is Friday ");
	                break;
	            case "sat":
	                System.out.println("Today is Saturday ");
	                break;
	                default:
	                System.out.println("wrong choice");
	    }
	}
}