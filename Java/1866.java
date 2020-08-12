import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int i,cont=0,op;

        i = entrada.nextInt();
        while(i>cont){
            op = entrada.nextInt();
            if(op % 2 == 0){
                System.out.println("0");
            }else{
                System.out.println("1");
            }
            cont++;
        }   
    }
}