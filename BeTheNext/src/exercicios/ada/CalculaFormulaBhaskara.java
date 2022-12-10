package exercicios.ada;

import java.util.Scanner;

public class CalculaFormulaBhaskara {

    double a, b, c, x1, x2, delta;
    Scanner scan = new Scanner(System.in);

    public CalculaFormulaBhaskara(){
        apresentacao();
        calculoDelta();
    }

    private void apresentacao(){
        System.out.println("=== Sistema de Algoritimo para calculo de fórmula de Bhaskara ===");
    }

    private void calculoDelta() {
        System.out.println("Digite o valor de A, B e C respectivamente a seguir: ");
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        delta = (b * b) +  (4 * a * c);

        System.out.println("Após calculo, valor de delta será: "+ delta);

        if((2 * a == 0) || (delta < 0)){
            System.out.println("Delta não possui raiz, não podendo calcular!");
            System.exit(0);

        } else {
            calculaX();
        }
    }

    private void calculaX() {
        x1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
        x2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);

        System.out.printf("Valor de x1 = %.5f \n", x1);
        System.out.printf("Valor de x2 = %.5f", x2);
    }

    public static void main(String[] arg){
        new CalculaFormulaBhaskara();
    }
}
