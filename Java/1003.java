import java.util.Scanner;


class Main{
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        
        int x,y,z;

        x = entrada.nextInt();
        y = entrada.nextInt();

        z = x + y;

        System.out.println("SOMA = "+z); 


    }
}