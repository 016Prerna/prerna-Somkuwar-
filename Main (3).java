/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
/**
 * tut5
 */
public class tut5 {

    public static void main(String args[]){

        String letter="Dear <|name|>, thanks a lot!!";
        Scanner sc = new Scanner(System. in);
        System.out.println("enter the name");
        String name=sc.next();
        name=name.toUpperCase();
        System.out.println(letter.replace("<|name|>",name));
    }
}