/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    double m1=60;
	    double m2=75;
	    double m3=66;
	    double m4=84;
	    double per;
	    char grade;
	    double total=m1+m2+m3+m4;
	    per=total/4.0;
	    if(per>=8)
	    grade='A';
	    else if(per>=75&&per<85)
	    grade='B';
	    else if(per>=55&&per<75)
	    grade='C';
	    else if(per>=40&&per<55)
	    grade='D';
	    else 
	    grade='E';
		System.out.println("percentage "+per+" Grade is "+grade );
	}
}
