package Cofrinho;

class MoedaEuro extends Moeda{

    public MoedaEuro(double valor){
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Euro: €" + valor);
    }

    @Override
    public double converter() {
        return valor * 6.50;
    }
}
