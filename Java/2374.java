import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int total, x, y;

        x = entrada.nextInt();
        y = entrada.nextInt();

        if(x>0 && x<=40 && y>0 && y<=40){
            total = x-y;
            System.out.println(total);
        }
    }
}