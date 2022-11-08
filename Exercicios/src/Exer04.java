/*Crie um programa que você atribua um valor da idade de uma pessoa e calcule
quantos dias aquela pessoa já viveu
 */

import java.util.Scanner;

public class Exer04 {

    public static void main (String[] args) {
        int ano, mes, idade, meses, dias;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");

        idade = scan.nextInt();
        ano = 365;
        mes = 30;

        dias = idade * ano;
        meses = idade * ano / mes;

        System.out.println("Sua idade em dias é de: " + dias);

    }
}
