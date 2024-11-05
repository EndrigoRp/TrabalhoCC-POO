package Cofrinho;

//Classe filha de moeda
class MoedaDolar extends Moeda {

    //Construtor de moedaDolar.
    public MoedaDolar(double valor){
        super(valor);
    }

    //Exibe informaçoes da moeda em questao.
    @Override
    public void info() {
        System.out.println("Dolar: $" + valor);
    }

    //Converte o valor da moeda pra Dolar.
    @Override
    public double converter() {
        return this.getValor() * 6.0;
    }

}
