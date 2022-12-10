package exercicios.ada;

import java.util.Scanner;

public class VerificandoQualificacoes {
    static int anoAtual, anoNaEmpresa, anoNasc, anoServ, idade, total;
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] arg){
        System.out.println("|| Verificando Qualificação para Aposentadoria ||");
        System.out.println("-> Digite o ano atual: ");
        anoAtual = leia.nextInt();

        System.out.println("-> Digite oo ano do seu nascimento: ");
        anoNasc = leia.nextInt();

        System.out.println("-> Digite o ano que ingressou na empressa: ");
        anoNaEmpresa = leia.nextInt();

        anoServ = anoAtual - anoNaEmpresa;
        idade = anoAtual - anoNasc;

        if(idade >= 65 && anoServ >= 30 || idade >= 60 && anoServ >= 25){
            System.out.printf("Sua idade é: %d \n", idade);
            System.out.printf("Seu tempo de serviço é: %d anos \n", anoServ);
            System.out.println(">>> REQUERER APOSENTADORIA! <<<");
        } else {
            System.out.printf("Sua idade é: %d \n", idade);
            System.out.printf("Seu tempo de serviço é: %d anos \n", anoServ);
            System.out.println(">>> NÂO REQUERER <<<");
        }
    }

}
