/*Criar uma função que transforma o valor de uma temperatura em graus
celsius em fahrenheit seguindo a fórmula abaixo:

fahrenheit = (celsius * fator1) + fator2

fator1 deve ser representado pela divisão de 9 por 5

fator2 = 32

Tanto fator1 e fator2 de devem ser constantes.

celcius deve ser variável um valor variável.

O seu programa deve calcular o valor em fahrenheit de ao menos duas
temperaturas distintas e deve imprimir o resultado no console.
*/

import java.util.Scanner;

public class Conversao {

    public static void main(String[] args) {
        double celsius, fah, fator1, fator2;
        Scanner scan = new Scanner(System.in);

        System.out.println(">>> Programa para Conversão de Temperaturas <<<");
        System.out.println("-> Digite a temperatura em graus Celsius para sua conversão: ");

        celsius = scan.nextDouble();
        fator1 = 9 / 5;
        fator2 = 32;

        fah = (celsius * fator1) / fator2;

        System.out.printf("Valor dos graus em Fahrenehit é: %.2f ºF",fah);

    }
}
