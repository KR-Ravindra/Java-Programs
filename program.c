#include <stdio.h>
int main() {

//  The questions says, you need to find number of food packets that can be distributed equally between x numbers (here messcnt)
//  Understand this as you need to share 3 chocolates between 2 people equally this way you can distribute 2 equally, 1 will be left over.

   int avlqntoffood,messcnt;
//    I am taking input below this lines
   scanf("%d %d",&avlqntoffood,&messcnt);

//    Since one of your mandatory test cases asks for these variables, I am having two variables below here 
   int divideqnt=avlqntoffood/messcnt;  // So this dividenqnt gives you how many food packets can be equally distributed
   int remfood=avlqntoffood%messcnt;  // This remfood will say the left over food that couldn't be distributed equally

//    This is the required output 
   printf("%d %d",divideqnt,remfood);

   return 0;
}
