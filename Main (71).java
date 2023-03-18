/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    java.util.Scanner sc=new java.util.Scanner(System.in);
	    int arr[][]=new int [3][3];
	    System.out.println("Enter Array Element: ");
	    for(int i=0;i<3;++i){
	        for(int k=0;k<3;++k){
	            arr[i][k]=sc.nextInt();
	           }
	        }
		System.out.print("The array elements are: ");
		for(int i=0;i<5;++i){
		    for(int k=0;k<3;++k){
		        System.out.println(arr[i][k]);
		    }
		    System.out.println();
		}
	    }
	}
