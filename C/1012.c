#include<stdio.h>
#include<math.h>
#define pi 3.14159

int main(){
	
	int i;
	double triangulo, circulo,trapezio,quadrado, retangulo, x[3];
	
	for(i=0;i<3;i++){
	scanf("%lf",&x[i]);
	}
	
	triangulo=(x[0]*x[2])/2;
	circulo= pi* pow(x[2],2);
	trapezio=((x[0]+x[1])*x[2])/2;
	quadrado=pow(x[1],2);
	retangulo=x[0]*x[1];
	
	printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",triangulo,circulo,trapezio,quadrado,retangulo);
	
	return 0;
}
