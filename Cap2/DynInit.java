package Cap2;

/*
demonstra  a inicializacao dinamica calculando o volume de um cilindro usando raio e base.
 */

public class DynInit {
    public static void main(String[] args) {
        double radius = 4,
               height = 5;

        // inicializada volume dinamicamente no tempo de execução.
        double volume = 3.1416*radius*radius*height;

        System.out.println("Volume is " + volume);


    }
}
