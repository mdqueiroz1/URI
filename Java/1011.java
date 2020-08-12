import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double pi = 3.14159, total, x;

        x = entrada.nextDouble();

        total = (4.0/3.0)* pi * Math.pow(x, 3.0);
        
        System.out.printf("VOLUME = %.3f\n", total);
    }
}