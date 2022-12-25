package Cap2;
/*
Demonstra algumas conversoes de tipo que requerem coerção
 */
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x/y); // converte double em int, ocorrera truncamento nessa conversao
        System.out.println("integer outcome of x/y: " + i);

        i=100;
        b=(byte) i; // nao ha perda de inf aqui pois um byte pode conter o valor 100
        System.out.println("Value of b: " + b);

        i=257;
        b=(byte) i; //desta vez a perda de informações um byte nao pode conter o valor 257.
        System.out.println("Value of b: " + b);

        b = 88; //ACII para x
        ch = (char) b; //coercao entre tipos incompativeis
        System.out.println("ch: " + ch);




    }

}
