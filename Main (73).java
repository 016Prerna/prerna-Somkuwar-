/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
	    int matrix[][]= {  {1,2,3},
	                       {4,5,6},
	                       {7,8,9},
	                       {10,11,1}   };
	    System.out.println("\n the matrix is :");
	    for(int i=0;i<4;i++){
	        for(int j=0;j<3;j++){
	            System.out.print(" "+matrix[i][j]);
	        }
	        System.out.println();
	    }
	}
}
