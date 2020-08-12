import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int i, cont=0;

        i = entrada.nextInt();

        while(cont<6){
            if(i%2 != 0){
                System.out.println(""+i);
                cont++;
            }
            i++;
        }
    }
}