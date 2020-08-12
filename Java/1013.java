import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int maior, x, y, z;

        x = entrada.nextInt();
        y = entrada.nextInt();
        z = entrada.nextInt();

        maior = x;

        if(y > maior){
            maior = y;
        }
        if(z > maior){
            maior = z;
        }

        System.out.println(maior+" eh o maior");
    }
}