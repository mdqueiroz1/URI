import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        String w;
        double x, y, total;

        w = entrada.next();
        x = entrada.nextDouble();
        y = entrada.nextDouble();

        y = (y * 15)/100;
        total = (x+y);
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}