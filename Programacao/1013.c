#include <stdio.h>
 
int main() {
 
    int x,y,z,maior;
    scanf("%d %d %d", &x, &y,&z);
    
	maior=x;
	if(maior<y){
		maior=y;
	}
	if(maior<z){
		maior=z;
	}
	    
    printf("%d eh o maior\n", maior);
 
    return 0;
}
