import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int w, x;
        double y, total;

        w = entrada.nextInt();
        x = entrada.nextInt();
        y = entrada.nextDouble();

        total = (x*y);
        
        System.out.println("NUMBER = "+w);
        System.out.printf("SALARY = U$ %.2f\n", total);
    }
}