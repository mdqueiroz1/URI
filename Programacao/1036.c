#include<stdio.h>
#include<math.h>

int main(){
	
	float a,b,c,delta,x1,x2;
		
	scanf("%f %f %f", &a,&b,&c);
	
	delta = (b*b) - (4 * a * c); 
	
	if((a*2)==0){
		printf("Impossivel calcular\n");
		return 0;
	}
	
	if(delta>0){
		delta = sqrt(delta);
	}	else {
			printf("Impossivel calcular\n");
			return 0;
		}
	
	x1= ((-b)+delta) / (2*a);
	x2= ((-b)-delta) / (2*a);
	
	printf("R1 = %.5f\nR2 = %.5f\n",x1,x2);
	return 0;
}
