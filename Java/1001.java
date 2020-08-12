import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int x,y,z;
    Scanner entrada = new Scanner(System.in);
        x = entrada.nextInt();
        y =  entrada.nextInt();
        z = x + y;
    System.out.println("X = " + z);
  }
}