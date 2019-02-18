#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
void main()
{
	int fd;
	int fd1;
	char buff[20];
	char buff1[20];
	fd = open("file1.txt",O_CREAT|O_RDWR,0744);
	read(0,buff,10);
	write(fd,buff,10);
	fd1 = open("file.txt",O_CREAT|O_RDWR,0744);
	write(fd1,buff,5);
	fd = open("file1.txt",O_RDWR,0744);
	read(fd,buff,5);
	fd1 = open("file.txt",O_RDWR,0744);
	write(fd1,buff,5);

}
