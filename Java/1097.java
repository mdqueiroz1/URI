class Main{

    public static void main(String[] args){
        
        int num = 1, cont = 7;
        
        while (num <= 9){
            System.out.printf("I=%d J=%d\n", num, cont--);
            System.out.printf("I=%d J=%d\n", num, cont--);
            System.out.printf("I=%d J=%d\n", num, cont--);
            num += 2;
            cont += 5;
        }
    }
}