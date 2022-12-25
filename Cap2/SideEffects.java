package Cap2;
/*
os efeitos colaterais podem ser importantes.
 */
public class SideEffects {
    public static void main(String[] args) {
        int i;

        i=0;

        /*
        Aqui, i é incrementada mesmo que a instrução if seja falsa
         */
        if(false & (++i < 100))
            System.out.println("this is won't be displayed");
        System.out.println("if statement executed: " + i); //exibe 1

        /*
        nesse caso, i não é incremetnada porque o operador de curto-circuito ignora o incremento.
         */
        if(false && (++i < 100))
            System.out.println("this won't be diplayed");
        System.out.println("if statement executed: " + i); // continua exibindo 1 !!!
    }
}
