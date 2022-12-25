package Cap2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x; //conhecida pelo codigo dentro do metodo main() escopo externo
        x = 10;
        if (x == 10) { //inicio do novo escopo

            int y = 20; //conhecida apenas nesse bloco, escopo interno

            //tanto x quanto y sao conhecidas aqui.

            System.out.println(" x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; //Erro! y não é conhecida aqui, pois esta fora do escopo
    }
}
