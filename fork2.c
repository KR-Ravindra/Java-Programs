#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/wait.h>
void main()
{
	int p = fork();
	int c2;
	if(p == 0)
	{
		printf("parent executed ");
	}
	else
	{
		c2 = fork();
		printf("Child 1 is executed");
	}

	if(c2 != 0 )
	{
		printf("Child 2 is executed");
	}
}
