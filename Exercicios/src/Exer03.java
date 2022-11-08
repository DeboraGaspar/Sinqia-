import java.util.Scanner;

/*Escreva um programa que realize o cálculo do empréstimo a juros compostos. Onde definimos:
 o valor da variável de quanto a pessoa quer emprestado;
em quantos meses ela irá pagar
A taxa de juros será de 2% ao mês
Fórmula: M = C * (1+i)^t
M = valor final após a aplicação dos juros
C = valor que a pessoa vai pegar emprestado
i é a taxa de juros
t é o tempo
Deverá exibir quanto a pessoa irá pagar após a aplicação dos juros
*/
public class Exer03 {
    public static void main (String[] args){
        double M, c, i, t;

        System.out.println("$ Calculando juros $");

        Scanner scan = new Scanner(System.in);

        System.out.println("-> Digite o valor do empréstimo: ");
        c = scan.nextDouble();

        System.out.println("-> Digite em quanto tempo deseja pagar: ");
        t= scan.nextDouble();

        i = 0.02;
        M = c * Math.pow((1+i), t);

        System.out.printf("O valor a ser pago após a aplicação do juros será de R$ %.2f",M);
    }
}

