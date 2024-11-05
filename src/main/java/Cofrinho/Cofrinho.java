package Cofrinho;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {

    private ArrayList<Moeda> listaMoedas = new ArrayList<>();

    public void adicionar(Moeda moeda){
        listaMoedas.add(moeda);
    }

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

    public void listagemMoedas(){
        for(Moeda moeda : listaMoedas){
                moeda.info();
        }
    }

    public  double totalConvertido(){
        double total = 0;
        for (Moeda moeda : listaMoedas){
            total +=moeda.converter();
        }
        return total;
    }

    public boolean isEmpty(){
        return listaMoedas.isEmpty();
    }

}
