/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


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
	    System.out.print("Enter first paper marks: ");
	    int m1=in.nextInt();
	    System.out.print("Enter second paper marks: ");
	    int m2=in.nextInt();
	    System.out.print("Enter third paper marks: ");
	    int m3=in.nextInt();
	    if(m1<45||m2<45||m3<45){
	        System.out.println("you are fail");
	   }
	   else{
	        System.out.println("you are pass ");
	   }
}
}
