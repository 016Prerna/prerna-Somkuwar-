/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int arr[]={2,3,11,1,4,10,35,7,2,25};
	    int small,large,i;
	    small=large=arr[0];
	    for( i=1;i<10;i++){
	        if(arr[i]<small)
	        small=arr[i];
	        
            if (arr[i]>large)
	        large=arr[i];
	    }
	    System.out.println("Smallest Number is "+small+"and Largest Number is "+large);
	    }
	        
}	
