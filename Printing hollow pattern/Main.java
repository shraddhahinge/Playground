#include <stdio.h>
int main() 
{
	int n;
  scanf("%d",&n);
  for(int row_no=1;row_no<=n;row_no++)
  {
    for(int star=1;star<=n;star++)
    {
      if(row_no==1 || row_no==n || star==1 || star==n)
       {
        printf("*");
      }
        else
        {
          printf(" ");
        }
      }
      printf("\n");
    }
  return 0;
  }
    
	
