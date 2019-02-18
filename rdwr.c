#include<stdio.h>
#include<unistd.h>
void main()
{
	char buff[10];
	printf("Enter any text:");
	read(0,buff,10);
	printf("Your entered text :");
	printf("\n");
	write(1,buff,7);
}
