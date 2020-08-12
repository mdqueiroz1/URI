import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int x, y, a, b;
        double z, total, c;

        x = entrada.nextInt();
        y = entrada.nextInt();
        z = entrada.nextDouble();
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextDouble();

        total = (y * z) + (b * c);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}