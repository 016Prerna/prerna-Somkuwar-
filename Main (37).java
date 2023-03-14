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
	    int p1=in.nextInt();
	    System.out.print("Enter second paper marks: ");
	    int p2=in.nextInt();
	    System.out.print("Enter third paper marks: ");
	    int p3=in.nextInt();
	    System.out.print("Enter gender(female/male): ");
	    String gender=in.next();
	    int total=p1+p2+p3;
	    double per=total/3.0;
	    if(per>=62 && gender.equals("female")){
	        System.out.println("You can take Admission.");
	         }
	    else{
	    System.out.println("You can't take Admission.");
	        }
	    }
	
}