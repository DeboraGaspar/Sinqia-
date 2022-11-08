import java.util.Scanner;

/*Escreva um programa para determinar a quantidade de cavalos para se levantar uma massa de “m” quilogramas a uma
altura de “h” em “t” segundos.
Considere cavalos = (m * h / t ) / 745,6999
*/
public class Exer02 {
    public static void main(String[] args){

        double cavalos, m, h, t;
        Scanner scan = new Scanner(System.in);

        System.out.println(" >>> Calculando quantidade de cavalos necessárias <<<\n~ Digite a altura:");
        h = scan.nextDouble();

        System.out.println("~ Digite quantos metros: ");
        m = scan.nextDouble();

        System.out.println("~ Digite quantos segudos: ");
        t = scan.nextDouble();

        cavalos = (m * h / t) / 745.6999;

        System.out.printf("A quantidade de cavalos necessária será: %.4f",cavalos);
    }
}
