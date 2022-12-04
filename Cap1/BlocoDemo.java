package Cap1;
/*
Demonstra um blco de codigo
 */
public class BlocoDemo {

    public static void main (String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // o alvo desta instrucao if é um bloco Código
        if(i !=0) {
            System.out.println("i does not equal zero");
            d = j/i;
            System.out.println("j/i is " + d);
        }
    }
}
