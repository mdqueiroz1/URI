import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int w, x, y, z, total;
        w = entrada.nextInt();
        x = entrada.nextInt();
        y = entrada.nextInt();
        z = entrada.nextInt();

        total = (w * x - y * z);
        
        System.out.println("DIFERENCA = "+total);
    }
}