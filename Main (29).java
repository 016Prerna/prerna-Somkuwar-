/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    byte b;
	    short s;
	    int i;
	    double d;
	    System.out.println("enter byte value:");
	    b=in.nextByte();
	    System.out.println("Enter short value:");
	    s=in.nextShort();
        System.out.println("Enter int value:");
        i=in.nextInt();
        System.out.println("Enter double value");
        d=in.nextDouble();
        System.out.println("byte value:"+b);
        System.out.println("short value"+s);
        System.out.println("int value"+i);
        System.out.println("double value"+d);
	}
}