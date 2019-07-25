#include <stdio.h>
int main()
{
 int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  printf("%d",gcd(n1,n2,n3));
  return 0;
}
int gcd(int n1,int n2,int n3)
{
  int min,gcd,min1;
  if(n1<n2)
  {
    min = n1;
  }
  else
  {
    min=n2;
  }
  if(n1%min==0 && n2%min==0)
  {
    gcd = min;
  }
  
  if(min>n3)
  {
    min1=min;
  }
  else
  {
    min1=n3;
  }
  if(min%min1==0 && n3%min1==0)
  {
    gcd=min1;
  }
  if(min<min1)
  {
  return min;
  }
  else
  {
    return min1;
  }
}
    