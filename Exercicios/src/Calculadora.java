import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        int x, y, op;
        Scanner scan = new Scanner(System.in);
        System.out.println(" === Calculadora ===");
        System.out.println("-> Insira o primeiro valor: ");
        x = scan.nextInt();

        System.out.println("-> Insira o segundo valor: ");
        y = scan.nextInt();

        System.out.println("-> Escolha uma das opções abaixo: " );
        System.out.println("-> 1 - SOMA ");
        System.out.println("-> 2 - SUBTRAÇÃO ");
        System.out.println("-> 3 - MULTIPLICAÇÃO ");
        System.out.println("-> 4 - DIVISÃO ");
        op = scan.nextInt();


        switch (op) {
            case 1:
                System.out.println(" \n Opção Selecionada: 1. Soma");
                System.out.println(" \n A soma dos dois valores é: " + (x + y));
                break;
            case 2:
                System.out.println(" \n Opção Selecionada: 1. Subtração");
                System.out.println(" \n A subtração dos dois valores é: " + (x - y));
                break;
            case 3:
                System.out.println(" \n Opção Selecionada: 1. Multiplicação");
                System.out.println(" \n A multiplicação dos dois valores é: " + (x * y));
                break;
            case 4:
                System.out.println(" \n Opção Selecionada: 1. Divisão");
                if (y == 0) {
                    System.out.println(" \n Não existe divisão por zero. ");
                } else {
                    System.out.println(" \n A divisão dos dois valores é: " + (x / y));
                }
                break;
            default:
                System.out.println(" \n Opção Inválida. ");
        }
    }
}
