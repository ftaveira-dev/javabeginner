package Cap1;
/*
Tente isto 1-1
Este programa converte galoes em litros
 */
public class GalToLit {
    public static void main (String args[]) {
        double gallons; //variavel que indica o numero de galoes
        double liters; //conten a conversao para litros

        gallons = 10; //começa com 10 galoes

        liters = gallons*3.7854; //converte para litros
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
