package desafio01.mercado.ada;

public class Regulador {

    public void aplicar(Mercado mercado){

        for(int i = 0; i < 10; i++) {
            Vendedor vendedor = mercado.getVendedores()[i];

            if(vendedor.getValorVenda() >= mercado.getMetas()){
                vendedor.setValorBonificacao((vendedor.getValorVenda() * 0.10f));
            }
            else {
                vendedor.setValorBonificacao(0);
            }
        }
    }
}
