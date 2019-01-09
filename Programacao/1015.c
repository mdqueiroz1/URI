#include<stdio.h>
#include<math.h>

int main(){
	
	float x[3],y[3];
	
	scanf("%f %f", &x[0], &y[0]);
	scanf("%f %f", &x[1], &y[1]);
	
	y[2]=(y[1]- y[0]) * (y[1]- y[0]);
	x[2]=(x[1]- x[0]) * (x[1]- x[0]);
	x[3]=x[2]+y[2];
	
	printf("%.4f\n", sqrt(x[3]));
	
	return 0;
}
