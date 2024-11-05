package Cofrinho;

class MoedaReal extends Moeda {

    public MoedaReal(double valor){
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Real: R$" + valor);
    }

    @Override
    public double converter() {
        return valor;
    }
}
