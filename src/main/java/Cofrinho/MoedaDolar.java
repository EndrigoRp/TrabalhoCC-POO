package Cofrinho;

class MoedaDolar extends Moeda {

    public MoedaDolar(double valor){
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dolar: $" + valor);
    }

    @Override
    public double converter() {
        return this.getValor() * 6.0;
    }

}
