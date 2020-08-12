import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    double x,y,z;
    
    Scanner entrada = new Scanner(System.in);
    
    x = entrada.nextDouble();
    y = 3.14159;
    z = y * x * x;
    
    System.out.printf("A=%.4f\n",z);
  }
}