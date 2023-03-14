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
	    System.out.print("Enter 1st no: ");
	    int a=in.nextInt();
	    System.out.print("Enter 2nd no: ");
	    int b=in.nextInt();
	    System.out.println("Click \n1. for Addition\n2. for Subtraction\n3. for Multiplication\n4. for Division ");
	    System.out.println("Enter Your Choice: ");
	    int ch=in.nextInt();
	    switch (ch){
	        case 1:
	            int res=a+b;
	            System.out.println("Addition is: "+res);
	            break;
	            case 2:
	                int res1=a-b;
	                System.out.println("Subtraction is: "+res1);
	                break;
	                case 3:
	                    int res2=a*b;
	                    System.out.println("Multiplication is: "+res2);
	                    break ;
	                    case 4:
	                        int res3=a/b;
	                        System.out.println("Division is: "+res3);
	                        break ;
	                        default:
	                        System.out.println("Wrong Choice .");
	                        break ;
	    }
	    }
	    } 
    
	    