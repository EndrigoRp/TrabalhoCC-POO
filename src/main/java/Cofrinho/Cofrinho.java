package Cofrinho;

import java.util.ArrayList;
import java.util.Iterator;


//A classe cofrinho recebe as moedas de diferentes tipos.
//A classe contem add, remover, listar, calcular valor total das moedas.
public class Cofrinho {

    //Uma lista das moedas existentes no cofrinho
    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    //Adiciona moeda no ArrayList.
    public void adicionar(Moeda moeda){
        listaMoedas.add(moeda);
    }

    /*  Percorre uma listaMoedas para encontrar moedas iguais aquelas passadas por parametros,
        quando encontra remove usando iterador e interrompe o loop, removendo apenas a primeira,
        moeda encontrada.  */
    public void remover(Moeda moeda){
        Iterator<Moeda> iterator = listaMoedas.iterator();
        while (iterator.hasNext()){
            Moeda m = iterator.next();
            if(m.equals(moeda)){
                iterator.remove();
                return;
            }
        }
    }

    //Informa todas as moedas no ArrayList.
    public void listagemMoedas(){
        for(Moeda moeda : listaMoedas){
                moeda.info();
        }
    }

    //Converte e calcula todas as moedas no ArrayList.
    public  double totalConvertido(){
        double total = 0;
        for (Moeda moeda : listaMoedas){
            total +=moeda.converter();
        }
        return total;
    }

    //Metodo verifica se o cofrinho esta vazio.
    public boolean isEmpty(){
        return listaMoedas.isEmpty();
    }

}
