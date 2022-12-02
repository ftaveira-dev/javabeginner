package Cap1;
/*
Esse programa ilustra a diferença entre int e double
 */
public class Example3 {
    public static void main(String args[]) {
        int var; //essa intrucao declara uma variavel int
        double x; //essa instrucao declara uma variavel de ponto flutuante

        var = 10; //atribui um valor a var

        x = 10.0;

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); //linha em branco
        System.out.println(); //linha em branco

        //agora dividindo ambas por 4

        var = var/4;
        x = x/4;

        System.out.println("var after division: " + var);
        System.out.println("x after divison: " + x);
    }
}
