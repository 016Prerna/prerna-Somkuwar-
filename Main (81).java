/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Arithmetic
{
    int res1,a,b;
    public Arithmetic (int x,int y){
        System.out.println("Parameterised Constructor is called.....");
        a=x;
        b=y;

    }
    public int add (){
        res1=a+b;
        return res1;
    }
} 
class Main{
	public static void main(String[] args) {
	    Arithmetic obj=new Arithmetic (11,44);
	    int res= obj.add();
        System.out.println("Addition is "+ res);
        
      }
}

