/* Escreva um programa que com base em uma temperatura em graus celsius, realize a conversão e exiba os resultados conforme as fórmulas abaixo:
Kelvin
K = Celsius + 273.15;
Fahrenheit
F = Celsius * 1.8 + 32;
Rankine
Ra = Celsius * 1.8 + 32 + 459.67
Réaumur
Re = Celsius * 0.8;
*/

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor dos graus Celsius para sua conversão: ");

        double grauCelsius = leia.nextDouble();

        double grauKelvin = grauCelsius + 273.15;

        double grauFah = grauCelsius * 1.8 + 32;

        double grauRank = grauCelsius * 1.8 + 32 + 459.67;

        double grauReau = grauCelsius * 0.8;

        System.out.println("Conforme o grau Celsius fornecido... Temos a seguinte conversões: \n" +
                "-> Kelvin: "+ grauKelvin+"\n-> Fahrenheit: "+ grauFah + "\n-> Rankine: " + grauRank +
                "\n-> Réamur: "+ grauReau);
    }
}
