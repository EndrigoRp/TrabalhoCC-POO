package Cofrinho;

//Classe filha de moeda
class MoedaEuro extends Moeda{

    //Construtor de moedaEuro.
    public MoedaEuro(double valor){
        super(valor);
    }

    //Exibe informaçoes da moeda em questao.
    @Override
    public void info() {
        System.out.println("Euro: €" + valor);
    }

    //Retorna o valor da moeda convertendo para Euro.
    @Override
    public double converter() {
        return valor * 6.50;
    }
}
