/*Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve observar
quantos parâmetros são enviados via terminal(args).

Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1, deve pedir
outro parâmetro via System.in. Se for 2, deve realizar a soma dos dois.

No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
*/

import java.util.Scanner;

public class SomandoNumeros {

    public static void main (String[] args){
        String valor;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 2 números: ");

        String array = scan.nextLine();

    }
}
