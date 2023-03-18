/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Main{
    public static void main(String[]args){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int sum=0;
        int arr[]=new int[5];
        System.out.println("Enter array Element: ");
        
        for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
        }
        for (int i= 0;i<5 ;++i ) {
            sum =sum+ arr[i];
        }
        System.out.println("the array sum is: "+sum);
    }
    
}