package aula04logica.ada;

import java.util.Scanner;

public class Logica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = args[0].charAt(0);

        //boolean b = (symbol == '+') ? true : false;

        Double a = scanner.nextDouble();
        Double b = scanner.nextDouble();
        Double res = 0d;

        if( symbol == '+') {
            res = a + b;
        }

        System.out.println(res);

    }
}
