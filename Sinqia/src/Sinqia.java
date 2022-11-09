import java.util.Scanner;

public class Sinqia {
    public static void main(String[] args) {
        int opcao, tempAtual, i = 0;
        double media = 0, calcMedia, acima, cont = 0;

        System.out.println(" >>> Programa Projeto Sinqia - Ada <<<");
        Scanner scan = new Scanner(System.in);

        System.out.println("-> Digite a quantidade de temperaturas a serem transformadas: ");
        int valor = scan.nextInt();
        System.out.println("-> Digite os valores das temperaturas: ");
        double[] temperaturas = new double[valor];
        for (i = 0; i < temperaturas.length; i++) {
            System.out.println((i + 1) + "º Temperatura ");
            temperaturas[i] = scan.nextDouble();
        }

        System.out.println("\n || MENU DE OPÇÕES ||");
        do {
            System.out.println("Escolha em qual temperatura está atualmente: \n -> 1 - CELSIUS" +
                    "\n -> 2 - KELVIN \n -> 3 - FAHRENHEIT");
            opcao = scan.nextInt();
            if (opcao != 1 && opcao != 2 && opcao != 3) {
                System.out.println("\n|| Você digitou uma opção inválida, tente novamente.|| ");
            }
        } while (opcao != 1 && opcao != 2 && opcao != 3);


        do {
            System.out.println("Escolha em qual temperatura será feita a conversão: \n -> 1 - CELSIUS" +
                    "\n -> 2 - KELVIN \n -> 3 - FAHRENHEIT");
            tempAtual = scan.nextInt();
            if (tempAtual != 1 && tempAtual != 2 && tempAtual != 3) {
                System.out.println("\n|| Você digitou uma opção inválida, tente novamente.|| ");
            }
        } while (tempAtual != 1 && tempAtual != 2 && tempAtual != 3);

        switch (tempAtual) {
            case 1:
                if (opcao == 2) {
                    for (i = 0; i < temperaturas.length; i++) {
                        temperaturas[i] = temperaturas[i] - 273;
                        System.out.println("Conversão de Kelvin para Celsius: " + temperaturas[i] + "ºC");
                    }
                }
                if (opcao == 3) {
                    for (i = 0; i < temperaturas.length; i++) {
                        temperaturas[i] = 1.8 * temperaturas[i] + 32;
                        System.out.println("Conversão de FAHRENHEIT para Celsius: " + temperaturas[i] + "ºC");
                    }
                }
                break;

            case 2:
                if (opcao == 1) {
                    for (i = 0; i < temperaturas.length; i++) {
                        temperaturas[i] = temperaturas[i] + 273;
                        System.out.println("Conversão de Celsius para Kelvin: " + temperaturas[i] + "ºK");
                    }
                }
                if (opcao == 2) {
                    for (i = 0; i < temperaturas.length; i++) {
                        temperaturas[i] = (temperaturas[i] - 32) * (5 / 9) + 273;
                        System.out.println("Conversão de FAHRENHEIT para Kelvin: " + temperaturas[i] + "ºK");
                    }
                }
                break;

            case 3:
                if (opcao == 1) {
                    for (i = 0; i < temperaturas.length; i++) {
                        temperaturas[i] = (temperaturas[i] * 9 / 5) + 32;
                        System.out.println("Conversão de Celsius para FAHRENHEIT: " + temperaturas[i] + "ºF");
                    }
                }
                if (opcao == 3) {
                    for (i = 0; i < temperaturas.length; i++) {
                        temperaturas[i] = (temperaturas[i] - 273) * (9 / 5) + 32;
                        System.out.println("Conversão de Kelvin para FAHRENHEIT: " + temperaturas[i] + "ºF");
                    }
                }
                break;
        }

        System.out.println("\n-- Verificando a média das temperaturaas --");
        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];
        for(i = 0; i < temperaturas.length; i++){
            if ( temperaturas[i] < menorTemperatura ){
                menorTemperatura = temperaturas[i];
            }
            if( temperaturas[i] > maiorTemperatura ) {
                maiorTemperatura = temperaturas[i];
                }
                media += temperaturas[i];
            }
        media = media / temperaturas.length;
        System.out.println("A temperatura média será de " + media );



    }
}
