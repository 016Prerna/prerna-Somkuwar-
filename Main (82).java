/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Arithmetic
{
    int res1,a,b;
    public Arithmetic (){
        System.out.println("Default Constructor is called.....");
        a=22;
        b=44;

    }
    public int add (){
        res1=a+b;
        return res1;
    }
} 
class Main{
	public static void main(String[] args) {
	    Arithmetic obj=new Arithmetic ();
	    int res= obj.add();
        System.out.println("Addition is "+ res);
        
      }
}
