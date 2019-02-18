#include <bits/stdc++.h>
using namespace std;
int main()
{
   int a[5],sum;
   int min = INT_MAX;
   int max = INT_MIN;
   for(int i=0; i<5; i++)
   {
      cin>>a[i];
   }
   for(int i=0; i<4; i++)
   {
     sum = a[i]+a[i+1]+a[i+2]+a[i+3];
     if(sum > max)
        {
            max = sum;
        }
     if(sum < min)
        {
            min = sum;
        }
   }
   cout<<min<<" "<<max;
}

