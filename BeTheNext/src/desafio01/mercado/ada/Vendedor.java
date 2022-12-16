package desafio01.mercado.ada;

public class Vendedor {

    private String nome;
    private String sobrenome;
    private int valorVenda;
    private double valorBonificacao;

    public Vendedor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Vendedor(String nome, String sobrenome, int valorVenda, int valorBonificacao) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.valorVenda = valorVenda;
        this.valorBonificacao = valorBonificacao;
    }

    public void vender(int valor){
        valorVenda += valor;
    }

    public String toString() {
        return nome + " " + sobrenome;
    }

    public void setValorBonificacao(float valor){
        valorBonificacao = valor;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public double getValorBonificacao() {
        return valorBonificacao;
    }

    public String mostraResultado() {
        return " > " + nome + " " + sobrenome + " valor total de vendas: " + getValorVenda() + "   ";
    }

}
