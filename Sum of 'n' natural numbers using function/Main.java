#include<stdio.h>
int sum_of_natural_numbers(int m)
{
  int i,sum=0;
    for(i=1;i<=m;i++)
    {
      sum=sum+i;
      
    }
  return sum;
}
int main()
{
  int n;
  scanf("%d",&n);
  int sum=sum_of_natural_numbers(n);
  printf("%d",sum);
  return 0;
}
   