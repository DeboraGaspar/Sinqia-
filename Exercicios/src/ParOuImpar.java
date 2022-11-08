import java.util.Scanner;

public class ParOuImpar {
    public static void numParOuImpar(int num) {
        if(num % 2 == 0){
            System.out.println(num + " <- Esse número é PAR! ");
        }
        else{
            System.out.println(num + " <- Esse número é ÍMPAR!");
        }
    }
    public static void main (String arg[]) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int num = scan.nextInt();
        numParOuImpar(num);
    }
}
