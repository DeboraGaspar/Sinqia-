package desafio01.mercado.ada;

public class Mercado {

    private String nome;
    private String local;
    private int totalVendas;
    private int metas;
    private Vendedor[] vendedores;
    public Mercado(Vendedor[] vendedores, int metas, String nome) {
        this.vendedores = vendedores;
        this.metas = metas;
        this.nome = nome;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public int getTotalVendas() {
        return totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public int getMetas() {
        return metas;
    }

    public void setTotal(int valor){
        totalVendas = valor;
    }
}