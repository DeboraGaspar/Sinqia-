package gamebingo.ada;

import java.util.Random;
import java.util.Scanner;

public class BingoGame {

    static Scanner scan = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        String[] jogadores = iniciar();
        int [][] cartelasJogadores = opcaoCartelas(jogadores);
        mostraCartelas(jogadores, cartelasJogadores);
        sorteando(jogadores, cartelasJogadores);

    }

    public static String[] iniciar(){
        System.out.println(":::::::::::::::::::::> BINGO ADA <:::::::::::::::::::::\n");
        System.out.println("Para iniciar, informe o número de jogadores: \n");

        int numJogadores = scan.nextInt();
        String[] jogadores = new String[numJogadores];

        System.out.println("Agora digite o nickname de cada jogador, separado por hífen(-):");
        jogadores = scan.next().split("-");

        return jogadores;
    }

    public static int[][] opcaoCartelas(String[] jogadores){
        int[][] cartelas = new int[jogadores.length][5];
        String[] entradaCartela = new String[5];
        int[] cartelaManual = new int[5];


        System.out.println(">> Digite qual a opção para gerar a cartela:\n ~> 1 - MODO MANUAL\n ~> 2 - MODO AUTOMÁTIICO");
        int opcaoEscolhida = scan.nextInt();

        for(int i = 0; i < jogadores.length; i++){
            if(opcaoEscolhida == 1) {
                System.out.println("-> Escolha 5 números de 0 a 60 e sem repetir!" +
                        "\n-> Digite os números escolhidos separados por vírgula... (ex: 1,2,3,4,5): ");
                entradaCartela = scan.next().split(",");

                for (int j = 0; j < 5; j++) {
                    cartelaManual[j] = Integer.parseInt(entradaCartela[j]);
                    cartelas[i][j] = cartelaManual[j];
                }
            }
            else if(opcaoEscolhida == 2){
                int[] modoAuto = gerarCartelas();
                for(int j = 0; j < modoAuto.length; j++){
                    cartelas[i][j] = modoAuto[j];
                }
            }
        }
        return cartelas;
    }
    private static int[] gerarCartelas(){
        int[] quantidade = new int[5];
        int i = 0;

        while(i < quantidade.length){
            quantidade[i] = random.nextInt(60);
            boolean confere = false;

            for(int j = 0; j < i; j++){
                if(quantidade[i] == quantidade[j]){
                    confere = true;
                    break;
                }
            }if(!confere){
                i++;
            }
        }
        return quantidade;
    }

    public static void mostraCartelas(String[] jogadores, int[][] cartelasJogadores){

    }
    public static int[][] limpar(String[] jogadores){
        int[][] zerar = new int[jogadores.length][5];

        for(int i = 0; i < jogadores.length; i++){
            for(int j = 0; j < 5; j++){
                zerar[i][j] = 0;
            }
        }
        return zerar;
    }

    public static void sorteando(String[] jogadores, int[][] cartelasJogadores){
        int[][] limparCartela = limpar(jogadores);

        System.out.println("-*-*-*-*-*-*-*- SORTEIO -*-*-*-*-*-*-*-");
        System.out.println("\n-> Escolha a opção para realizar o sorteio:\n# 1 - MODO MANUAL\n# 2 - MODO AUTOMÁTICO");

        int menu = scan.nextInt();

        if(menu == 1){
            realizarSorteio(jogadores, cartelasJogadores,scan, limparCartela,menu);
        }
        else if(menu == 2){
            realizarSorteio(jogadores, cartelasJogadores, scan, limparCartela, menu);
        }
    }

    private static void realizarSorteio(String[] jogadores, int[][] cartelasJogadores, Scanner scan, int[][] limparCartela, int menu) {
        String[] entradaCartela = new String[5];
        int[] cartelaSorteada = new int[5];
        int[][] qtAcertos = new int[jogadores.length][1];
        int[][] acertos = limparCartela;
        boolean verifica = false;
        int rodadas = 0;
        int vencedor = 0;
        int totalNums = 0;

        while (verifica == false){
            if(menu == 1) {
                System.out.println("-> Escolha 5 números de 0 a 60 e sem repetir!" +
                        "\n-> Digite os números escolhidos separados por vírgula... (ex: 1,2,3,4,5): ");
                entradaCartela = scan.next().split(",");

                for(int j = 0; j < 5; j++){
                    cartelaSorteada[j] = Integer.parseInt(entradaCartela[j]);
                    totalNums++;
                }

            }
            else if(menu == 2) {
                cartelaSorteada = gerarCartelas();
                totalNums++;
            }

            for(int i = 0; i < jogadores.length; i++){
                for(int a = 0; a < 5; a++){
                    for(int b = 0; b < 5; b++){
                        if (cartelasJogadores[i][a] == cartelaSorteada[b]){
                            acertos[i][a] = 1;
                            qtAcertos[i][0]++;
                        }
                    }
                }

                if(qtAcertos[i][0] == 5){
                    verifica = true;
                    vencedor = i;
                }
            }
            rodadas++;
        }

        System.out.println("|| RESULTADOS ||\n\n");
        System.out.printf("Ganhador do BINGO ADA: %d ___lol lol lol lol___ THE WIN *%s*\n", vencedor+1, jogadores[vencedor]);
        System.out.println("-- Resultado da cartela premiada: ");
        for(int i = 0; i < 5; i++){
            System.out.printf("| %d |",cartelasJogadores[vencedor][i]);
        }
        System.out.printf("\n~> Quantidade de rodadas: %d\n", rodadas);
        System.out.printf("~> Quantidade de números sorteados: %d\n", totalNums);
        System.out.println("############### FIM DE JOGO ###############");
    }
}

