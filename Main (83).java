/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Arithmetic
{
    int res1=0;
    public Arithmetic (){
        System.out.println("Constructor is called.....");
        
    }
    public int add (int a,int b){
        res1=a+b;
        return res1;
    }
} 
class Main{
	public static void main(String[] args) {
	    Arithmetic obj=new Arithmetic ();
	    int res= obj.add(33,22);
        System.out.println("Addition is "+ res);
        
      }
}