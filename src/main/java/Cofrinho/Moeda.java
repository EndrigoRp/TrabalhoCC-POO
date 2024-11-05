package Cofrinho;

import java.util.Objects;

//Classe Mae abstrata.
abstract class Moeda {

    //Valor monetario.
    protected double valor;

    //Exibi informaçoes sobre a moeda.
    public abstract void info();

    //Converte o valor de uma moeda para outra.
    public abstract double converter();

    //Construtor de Moeda
    public Moeda(double valor) {
        this.valor = valor;
    }

    //Setter: retorna o valor monetario.
    public double getValor() {
        return valor;
    }

    //Compara moeda com outra e verifica se sao iguais.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }

    //Retorna o codigo hash desta moeda.
    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }
}
