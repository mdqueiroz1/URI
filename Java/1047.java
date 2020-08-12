import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int h1, m1, h2, m2,totalHora1,totalHora2,horaFim,minFim;

        h1 = entrada.nextInt();
        m1 = entrada.nextInt();
        h2 = entrada.nextInt();
        m2 = entrada.nextInt();

        if( h1<24 && h1>=0 && m1>=0 && m1<60 &&
            h2<24 && h2>=0 && m2>=0 && m2<60){
            
            totalHora1 = (h1*60)+m1;
            totalHora2 = (h2*60)+m2;
            minFim = (totalHora1 - totalHora2);

            if(minFim >= 0){
                minFim = 1440 - minFim;
                
                horaFim = (minFim / 60);
                minFim = minFim % 60;

                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horaFim,minFim);
            }else{
                minFim = minFim * (-1);
                horaFim = (minFim / 60);
	            minFim = minFim % 60;
                System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",horaFim,minFim);
            }
        }
    }
}