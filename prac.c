#include<stdio.h>

int sort(int a[], int n)
{
   int i,indexmax=a[i];
   for (i=0; i<n; i++)
   {
      if (a[i]>indexmax)
      {
        a[i]=indexmax;
      } 
      return indexmax;
   }
}
int main()
{
    int n,i;
    printf("Enter number of Data\n");
    scanf("%d",&n);

    int a[n];
    for (i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }

    int x=sort(a[i], n);
    printf("%d",x);

   return 0;
}
