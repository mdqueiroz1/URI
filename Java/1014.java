import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int x;
        double y, total;

        x = entrada.nextInt();
        y = entrada.nextDouble();

        total = x/y;

        System.out.printf("%.3f km/l\n",total);
    }
}