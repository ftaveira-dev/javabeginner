package Cap1;
/*
Tente Isto 1-2
Este programa ira exibir uma tabela de conversoes comecando com 1 galao e terminando 100 galoes.
A cada 10 galoes uma linha em branco sera exibida. Sera usado uma variavel counter para isso.
 */
public class GalToLitTable {

    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0; //inicia contador de linhas com 0
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // converter para litros
            System.out.println(gallons + " gallons is " + liters + " liters.");

            counter++; //incrementa o contador de linhas a cada iteracao do loop
            //a cada decima linha, exibe uma linha em branco
            if (counter == 10) {
                System.out.println(); //se o valor do contador for 10 exibe uma linha em branco.
                counter = 0; //zera o contador de linhas
            }

        }


    }
}
