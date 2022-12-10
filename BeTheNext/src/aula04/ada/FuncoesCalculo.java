package aula04.ada;

public class FuncoesCalculo {
    static Double x1 = 1d;
    static Double x2 = 2d;

    public static Double calcula(Double v1, Double v2, Double v3){
        return v1 + v2 + v3;
    }

    public Double calcula(Double v3){
        return x1 + x2 + v3;
    }

    // public, protected, package, private
}
