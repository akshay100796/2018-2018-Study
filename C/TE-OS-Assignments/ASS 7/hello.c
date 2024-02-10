


#include<linux/kernel.h>
asmlinking long sys_hello(void)
{
	printf(KERN_INFO"Hello World\n");
	return 0;
}
