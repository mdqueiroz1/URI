#include<stdio.h>


int main(){
	
	char x[10];
	
	float total, y,z;
	
	scanf("%s", &x);
	
	scanf("%f %f", &y, &z);
	
	total = (z*15)/100;
	total= total+y;
	
	printf("TOTAL = R$ %.2f\n", total);
	
	return 0;
	
}
