import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double x;
        x = entrada.nextDouble();

        if(x>=0 && x<=25.0){
            System.out.println("Intervalo [0,25]");
        }else{
            if(x>25.0 && x<=50.0){
                System.out.println("Intervalo (25,50]");
            }else{
                if(x>50.0 && x<=75.0){
                    System.out.println("Intervalo (50,75]");
                }else{
                    if(x>75.0 && x<=100.0){
                        System.out.println("Intervalo (75,100]");
                    }else{
                        System.out.println("Fora de intervalo");
                    }
                }
            }
        }
    }
}