#include<stdio.h>
#include<math.h>

int main(){
	
	int resto,valor,hr,min;
	
	scanf("%d",&valor);
	
	hr=valor/3600;
	resto=valor%3600;
	
	min=resto/60;
	resto=resto%60;
	
	printf("%d:%d:%d\n",hr,min, resto);
			
	return 0;
}
