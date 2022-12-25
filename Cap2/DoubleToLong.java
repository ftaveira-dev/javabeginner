package Cap2;
// Esse programa nao sera compilado****
public class DoubleToLong {
    public static void main(String[] args) {
        long L;
        double D;

        D = 100123285.0;
        L = D; // INVALIDO nao é possivel conversao automatica de double para long

        System.out.println("L and D: " + L + " " + D);
    }


}
