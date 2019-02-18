#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/wait.h>
void main()
{
	int p = fork();
	if(p==0)
	{
		printf("Parent process executed");
		for(int i=10; i<20; i++)
		{
			printf("\n%d\n",i );
		}
	}
	else
	{
		wait(NULL); //makes child process execute first.
		printf("Child process executed");
		for(int i=1; i<10; i++)
		{
			printf("\n%d\n",i);
		}
	}
}
