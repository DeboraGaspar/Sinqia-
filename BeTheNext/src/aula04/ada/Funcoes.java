package aula04.ada;

public class Funcoes {

    public static void main(String[] args) {
        FuncoesCalculo funcoes = new FuncoesCalculo();

        Double res1 = funcoes.calcula(9d, 8d, 3d);
        Double res2 = funcoes.calcula(5d);

        System.out.println( res1 );
        System.out.println( res2 );

    }


}
