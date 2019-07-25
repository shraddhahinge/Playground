#include <stdio.h>
int main()
{
  int n1,n2,n3;
  scanf("%d %d %d",&n1,&n2,&n3);
  printf("%d",greatest(n1,n2,n3));
  return 0;
}
 int greatest(int n1,int n2,int n3)
 {
   int g;
   if(n1>n2)
   {
     g=n1;
   }
   else
   {
     g=n2;
   }
   if(g>n3)
   {
     return g;
   }
   else 
   {
     return n3;
   }
 }
	