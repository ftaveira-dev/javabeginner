package Cap2;
/*
Demonstra a conversao automatica de long para double.
 */
public class LongToDouble {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L; //conversao automatica de long para double.

        System.out.println("L and D: " + L + " " + D);
    }
}
