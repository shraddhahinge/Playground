#include <stdio.h>
int main() 
{
	int n;
  scanf("%d",&n);
  int sum=0;
    for(int count=1;count<=n;count++)
    {
      sum=sum+count;
    }
  printf("%d",sum);
  return 0;
}