/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=4;
		for (int i=0;i<n;i++) {
			for (int j=2*(n-i);j>=0 ;j--) {
				System.out.print(" ");
			}
			for (int j=0;j<=i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
    
}
	