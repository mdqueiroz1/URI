#include<stdio.h>

int main(){
	
	float a,b,c,media,media1;
	
	scanf("%f %f %f", &a,&b,&c);
	
	media=(a*2.0+b*3.0+c*5.0);
	media1=media/10;
	printf("MEDIA = %.1f\n", media1);
	
	return 0;
}
