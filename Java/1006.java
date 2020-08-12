import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double x, y, z, total;
        x = entrada.nextDouble();
        y = entrada.nextDouble();
        z = entrada.nextDouble();
        
        if(x>0 || y>0 || z>0 || x<=10 || y<=10 || z<=10){
            x = x * 2.0;
            y = y * 3.0;
            z = z * 5.0;
            total = (x+y+z)/10;
            System.out.printf("MEDIA = %.1f\n",total);
        }
    }
}