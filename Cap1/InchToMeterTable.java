package Cap1;
/*
Este programa exibe uma tabela de conversao de polegadas para metros.
 */
public class InchToMeterTable {

    public static void main(String args[]) {
        double inches, meters;
        int counter;

        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; //converte polegada para metros
            System.out.println(inches + " inches is " + meters + "meters,");

            counter++;

            if (counter == 12) // a cada 12 linhas exibe uma linha em branco
            {
                System.out.println();
                counter = 0; //zera o contador de linhas
            }
        }
    }

}