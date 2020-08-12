import java.util.Scanner;

class Main{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio, quadrado,retangulo, pi = 3.14159;
        
        a = entrada.nextDouble();
        b = entrada.nextDouble();
        c = entrada.nextDouble(); 

        triangulo = (a*c)/2;
        circulo = pi* Math.pow(c,2);
        trapezio = ((a+b)*c)/2;
        quadrado = b*b;
        retangulo = a*b;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",triangulo,circulo, trapezio, quadrado, retangulo);
    }
}