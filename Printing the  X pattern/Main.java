#include <stdio.h>
int main() 
{
	int n;
  scanf("%d",&n);
  for(int row_no=1;row_no<=n;row_no++)
  {
    for(int star=1;star<=n;star++)
    {
      if(row_no==star || star==n-row_no+1)
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
    
	
