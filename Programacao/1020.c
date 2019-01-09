#include<stdio.h>
#include<math.h>

int main(){
	
	int resto,valor,ano,mes;
	
	scanf("%d",&valor);
	
	ano=valor/365;
	resto=valor%365;
	
	mes=resto/30;
	resto=resto%30;
	
	printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",ano,mes, resto);
			
	return 0;
}
