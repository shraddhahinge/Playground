// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
 int n;
  scanf("%d \n",&n);
  int arr[n];
  for(int index = 0; index < n; index++)
  {
    scanf("%d",&arr[index]);
  }
  int max=arr[0];
  int loc;
  for(int index = 0; index < n; index++)
  {
    if(max<arr[index])
      max=arr[index];
    loc=index;
  }
  printf("%d",loc);

  
   return 0;
}