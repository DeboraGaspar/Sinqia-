import java.util.Scanner;

/*Crie um programa que com base em um salário de um funcionário, reajusta o salário em 7% e mostra o valor antes
do reajuste e após.
*/
public class Exer05 {
    public static void main (String[] args){

        double salarioAtual, reajuste, salarioComReajuste;

        Scanner scan = new Scanner(System.in);
        System.out.println("--> Informe seu salário: ");

        salarioAtual = scan.nextDouble();
        reajuste = 0.07;
        salarioComReajuste = salarioAtual + (salarioAtual * reajuste);

        System.out.printf("\nNovo salário: %.2f", salarioComReajuste);
        System.out.println("\nSalário anterior: "+salarioAtual);
    }
}
