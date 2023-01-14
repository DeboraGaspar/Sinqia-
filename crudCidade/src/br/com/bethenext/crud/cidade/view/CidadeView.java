package br.com.bethenext.crud.cidade.view;

import br.com.bethenext.crud.cidade.controller.CidadeController;
import br.com.bethenext.crud.cidade.model.Cidade;

import java.util.Scanner;

public class CidadeView {

    private CidadeController controller;
    private Scanner scanner;

    public CidadeView(CidadeController controller, Scanner scanner) {
        this.controller = controller;
        this.scanner = scanner;
    }

    public void cadastrar() {
        Cidade cidade = new Cidade();

        System.out.println("Digite o nome da cidade: ");
        String nome = scanner.nextLine();
        cidade.setNome(nome);

        System.out.println("Digite o nome do estado: ");
        String nomeEstado = scanner.nextLine();
        cidade.setEstado(nomeEstado);

        controller.cadastrar(cidade);
    }


    public void menuOpcoes() {

        System.out.println(">> Escolha a opção a seguir: ");
        System.out.println("-> 1 - Cadastrar");
        System.out.println("-> 0 - Sair");

        Integer opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida! ");
        }
        menuOpcoes();
    }

}
