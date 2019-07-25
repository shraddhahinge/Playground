#include<stdio.h>
int main()
{
 int n;
  scanf("%d",&n);
  int first_digit,second_digit;
  first_digit=n/100;
  second_digit=n%10;
  int sum=first_digit+second_digit;
  printf("%d",sum);
  return 0;
}