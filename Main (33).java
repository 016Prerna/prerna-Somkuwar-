/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int a=3;
	    int b=7;
	    int c=22;
	    int big;
	    if(a>b){
	        if(a>c)
	        big=a;
	        else 
	        big=c;
	    }
	    else{
	        if (b>c)
	        big=b ;
	        else 
	        big=c;

	    }
		System.out.println("Big value is "+big);
	}
}
