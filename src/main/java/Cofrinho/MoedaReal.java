package Cofrinho;

//Classe filha de Moeda
class MoedaReal extends Moeda {

    //Construtor de MoedaReal.
    public MoedaReal(double valor){
        super(valor);
    }

    //Exibe informaçoes sobre a moeda em questao.
    @Override
    public void info() {
        System.out.println("Real: R$" + valor);
    }

    //Retorna o valor da moeda sem conversao.
    @Override
    public double converter() {
        return valor;
    }
}
