package Cap2;
/*
Demonstra os operadores de curto circuito]
& AND, se o primeiro operando for falso o resultado sera falso
| OR, se o primeiro operando for verdadeiro, o resultado sera ser verdadeiro.
^ XOR,
|| OR DE CURTO CIRCUITO
&& AND DE CURTO CIRCUITO
! NOT


a diferenca entre a comum e de curto circuito é que a de CC avalia so o segundo operando quando necessario,
a comum sempre avalia cada operando.
 */
public class SCops {
    public static void main(String[] args) {
        int n, d, q;

        n=10;
        d=2;
        if(d !=0 && (n%d) == 0)
            System.out.println(d + " is a factor of " + n);
        d=0; // configura d com zero

        // já que d é igual a zero, o segundo operando não é avaliado.
        if(d !=0 && (n%d) == 0) // o operador de curto-circuito impede uma divisao por zero.
            System.out.println(d + " is a factor of " + n);
        /*
        tente a mesma coisa sem o operador de curto circuito, isso causara um erro de divisao por zero
         */

        if(d !=0 & (n%d) == 0) // agora as duas expressoes sao avaliadas, permitindo que ocrra uma divisao por zero
            System.out.println(d + " is a factor of " + n);

    }

}
