#include<stdio.h>
#include<math.h>

int main(){
	
	double x,pi=3.14159,total;
	
	scanf("%lf",&x);
	
	total= (4.0/3.0) * pi * pow(x,3);
	
	printf("VOLUME = %.3f\n",total);
	
	return 0;
}
