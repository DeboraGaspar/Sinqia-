package desafio01.mercado.ada;

import java.util.Random;

public class Main {

    public static final String[] nome = new String[]{"Amorim", "Tadeu", "Fernando", "Augusto", "Rita", "Maria",
            "Joaquim", "Josefa", "Messias", "Albertina"};
    private static final String[] sobrenome = new String[]{"Santos", "Silva", "Ramos", "Neves", "Santana", "Carvalho",
            "Dias", "Oliveira", "Cardoso", "Lopes"};
    private static final Random random = new Random();

    public static void main(String[] args) {

        Vendedor[] vendedoresFrutas = new Vendedor[10];
        Vendedor[] vendedoresCosmeticos = new Vendedor[10];
        Vendedor[] vendedoresFarmacia = new Vendedor[10];

        novoVendedor(nome, sobrenome, vendedoresFrutas, random);
        novoVendedor(nome, sobrenome, vendedoresCosmeticos, random);
        novoVendedor(nome, sobrenome, vendedoresFarmacia, random);

        Mercado mercadoFrutas = new Mercado(vendedoresFrutas, 550, "frutas");
        Mercado mercadoCosmeticos = new Mercado(vendedoresCosmeticos, 740, "Cosmeticos");
        Mercado mercadoFarmacia = new Mercado(vendedoresFarmacia, 820, "Farmacos");
        Mercado[] mercados = new Mercado[]{mercadoFrutas, mercadoCosmeticos, mercadoFarmacia};

        Comprador comprador = new Comprador();
        Regulador regulador = new Regulador();

        realizarVenda(mercadoFrutas, comprador);
        realizarVenda(mercadoCosmeticos, comprador);
        realizarVenda(mercadoFarmacia, comprador);

        regulador.aplicar(mercadoFrutas);
        regulador.aplicar(mercadoCosmeticos);
        regulador.aplicar(mercadoFarmacia);

        mostraResumo(mercadoFrutas);
        mostraResumo(mercadoCosmeticos);
        mostraResumo(mercadoFarmacia);

        melhorVendedor(mercados);
        melhorMercado(mercados);

    }

    private static void novoVendedor(String[] nome, String[] sobrenome, Vendedor[] AddVendedor, Random random) {

        for (int i = 0; i < nome.length; i++) {
            int indiceNome = random.nextInt(nome.length);
            String nomeFinal = nome[indiceNome];

            int indiceSobrenome = random.nextInt(sobrenome.length);
            String sobrenomeFinal = sobrenome[indiceSobrenome];
            AddVendedor[i] = new Vendedor(nomeFinal, sobrenomeFinal);
        }
    }

    private static void realizarVenda(Mercado mercado, Comprador comprador){
        int totalVendas = 0;

        for(int i = 0; i < 10; i++){
            comprador.comprar(mercado.getVendedores()[i]);
            totalVendas += mercado.getVendedores()[i].getValorVenda();
        }

        mercado.setTotal(totalVendas);
    }

    private static void mostraResumo(Mercado mercado) {
        System.out.println("\n---------------------------------------------------------------------\n");
        System.out.printf(">>>>>> Segue resumo do mercado %s <<<<<<\n\n", mercado.getNome());

        System.out.println("-> A meta de venda para cada vendedor: " + mercado.getMetas());
        System.out.println("-> O total de vendas realizado do mercado: " + mercado.getTotalVendas() + "\n");
        System.out.println("\n\n >>>>>> Segue para os vendedores suas vendas e bonificações <<<<<<\n\n");

        for (int i = 0; i < 10; i++) {
            Vendedor vendedor = mercado.getVendedores()[i];
            System.out.printf(vendedor.mostraResultado() + ">> Bonificação: %.2f\n", vendedor.getValorBonificacao());
        }
    }

    private static Vendedor verifica(Mercado mercado){
        int inicio = 0;
        int qtd = 0;

        for(int i = 0; i < mercado.getVendedores().length; i++) {
            if(mercado.getVendedores()[i].getValorVenda() > inicio) {
                qtd = i;
                inicio = mercado.getVendedores()[i].getValorVenda();
            }
        }
        return  mercado.getVendedores()[qtd];
    }

    private static void melhorVendedor(Mercado[] mercados){
        Vendedor melhorVendedor[] = new Vendedor[3];

        for(int i = 0; i < mercados.length; i++){
            melhorVendedor[i] = verifica(mercados[i]);
        }

        System.out.println("\n\n =*=*=*=*=*=*= TOP 3 VENDEDORES =*=*=*=*=*=*= \n\n");
        for(int i = 0; i < melhorVendedor.length; i++) {
            System.out.printf(">>>> %s  |  Mercado: %s  |  Quantidade de vendas:   <<<< \n", melhorVendedor[i].toString(),
                    mercados[i].getNome(), melhorVendedor[i].getValorVenda());
        }
    }

    private static void melhorMercado(Mercado[] mercados) {
        int inicio = 0;
        int qtd = 0;
        for(int i = 0; i < mercados.length; i++){
            if(mercados[i].getTotalVendas() > inicio){
                qtd = i;
                inicio = mercados[i].getTotalVendas();
            }
        }
        System.out.println("\n\n =*=*=*=*=*=*= MELHOR MERCADO =*=*=*=*=*=*= \n\n");
        System.out.printf(">>> O Mercado que obteve mais rentábilidade foi : %s !!! <<< \n", mercados[qtd].getNome());
    }
}

