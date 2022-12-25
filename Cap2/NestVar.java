package Cap2;
/*
Este programa tenta declarar uma variavel em um escopo interno com o mesmo nome de uma var do externo

nao será compilado
 */
public class NestVar {
    public static void main(String[] args) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("this is count " + count);

            int count; //invalido, ja foi declarado anteriormente
            for (count = 0; count < 2; count++)
                System.out.println("this program is in error");
        }
    }
}
