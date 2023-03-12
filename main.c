/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
void fun();
extern int x=5;

int main()
{
    printf("x=%d",x);
    x=15;
    fun();

    return 0;
}
void fun(){printf("x=%d",x);}
