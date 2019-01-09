#include<stdio.h>
#include<stdlib.h>

int main(){

	int i;
	float n[4],mediaNotas,notaExame,notaFinal;
	
	for(i=0;i<4;i++){
		scanf("%f",&n[i]);
	}
	
	mediaNotas = ((n[0]*2)+(n[1]*3)+(n[2]*4)+(n[3]))/(2+3+4+1);
	printf("Media: %.1f\n", mediaNotas);
	
	if(mediaNotas>7.0){
	
		printf("Aluno aprovado.\n");
		exit(1);
	
	}else if(mediaNotas<5.0){
	
		printf("Aluno reprovado.\n");
		exit(1);
	
	}else if(mediaNotas>=5.0 && mediaNotas<7){
	
		printf("Aluno em exame.\n");
		printf("Nota exame: ");
		scanf("%f", &notaExame);
		notaFinal=(notaExame+mediaNotas)/2;
		
		if(notaFinal<5){
	
			printf("Aluno reprovado.\n");
	
		}else printf("Aluno aprovado.\n");
	}
	
	printf("Media final: %.1f\n",notaFinal);
	
	return 0;
}
