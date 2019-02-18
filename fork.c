#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<sys/wait.h>
void main()
{
	int p = fork();
	if(p == 0)
	{
		int childid = getpid();
		int parentid = getppid();

		printf("\n child id : %d ", childid );
		printf("\n parent id : %d", parentid);
	}
	else
	{
		wait(NULL);
		int parent_id = getpid();
	        int parent_parentid = getppid();
		printf("\n Parent id : %d ", parent_id);
		printf("\n Parent_parent id : %d ", parent_parentid);
	}
}

