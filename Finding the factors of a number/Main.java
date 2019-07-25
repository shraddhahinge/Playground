#include <stdio.h>
int main() 
{
  int n;
  scanf("%d", &n);
  
  for(int num=1;num<=n;num++)
  {
    if(n%num==0)
      printf("%d\n",num);
  }
	
	return 0;
}