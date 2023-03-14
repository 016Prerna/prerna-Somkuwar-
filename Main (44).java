/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] marks={125,132,95,116,110};
	    int max=marks[0];
	    for (int num: marks){
	        if(num>max){
	            max= num;
	        }
	    }
	    
		System.out.println("student highest score is : "+max);
	}
}
