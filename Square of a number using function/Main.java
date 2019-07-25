#include<stdio.h>
int square_of_number(int m)
{
   int son=m*m;
return son;
}
int main() 
{
  int n;
  scanf("%d",&n);
  int son = square_of_number(n);
  printf("%d",son);
return 0;
}
