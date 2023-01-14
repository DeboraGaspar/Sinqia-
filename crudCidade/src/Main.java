import br.com.bethenext.crud.cidade.controller.impl.CidadeArmazenamentoVolatilController;
import br.com.bethenext.crud.cidade.model.Cidade;
import br.com.bethenext.crud.cidade.view.CidadeView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CidadeView view = new CidadeView(new CidadeArmazenamentoVolatilController(), new Scanner(System.in));
        view.menuOpcoes();
    }
}