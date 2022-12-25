package Cap2;
/*
Variaveis de caracteres podem ser tratadas como inteiros
 */
public class CharArithDemo {

    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; //incrementa ch, um char pode ser incrementado
        System.out.println("ch is now " + ch);

        ch = 90; // da a ch o valor Z, um char pode receber um valor inteiro.
        System.out.println("ch is now " + ch);

    }


}
