package aula03.ada;

public class Variaveis {

    public static void main(String[] args) {

        byte a = 0; //127
        // 1 byte = 8 bits... 2^3 = 8 ..00000000
        // 0000 = 0...
        // 0001 = 1 = 2^0 = 1
        // 0100 = 4 = 2^2 = 4

        int a1 = 1;
        short a2 = 32767;

        char char1 = 'a'; // char estrito especifico alocado - 16 bits - unicode
        char char2 = 'b'; // banco de dados - varchar - 10

        String t1;
        String t2 = "texto";
        String t3 = new String("Texto");
        String t4 = "hello" + "World";

        String x1 = "123";
        String x2 = "abc";
        String  x3 = x1 + x2 + "456";
        System.out.println(x3);

        boolean par = ((9 / 3) % 2 ) == 0;
        System.out.println(par);


    }
}
