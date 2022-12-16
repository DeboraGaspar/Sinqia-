package desafio01.mercado.ada;

import java.util.Random;

public class Comprador {

    private Random random = new Random();

    public void comprar(Vendedor vendedor){
        vendedor.vender(random.nextInt(1000));
    }
}
