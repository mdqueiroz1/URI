import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double x,y,z;
        x = entrada.nextDouble();
        y = entrada.nextDouble();
        
        if(x>0 || y>0 || x<=10 || y<=10){
            x = x * 3.5;
            y = y * 7.5;
            z = (x+y)/11;
            System.out.printf("MEDIA = %.5f\n",z);
        }
    }
}