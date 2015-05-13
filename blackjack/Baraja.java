package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Baraja {
    List<Carta> cartaList;
    int seed=0;
    
    public Baraja(int seed) {
        this();
        this.seed=seed;
    }
    
    public Baraja(){
        
        cartaList = new ArrayList();
        //ValorEnum /*v*/;
        for (ValorEnum valor : ValorEnum.values()){
                for (PintaEnum pinta : PintaEnum.values()){
                    Carta c;
                    c=new Carta(valor,pinta);
                    cartaList.add(c);
                }
        }
    }

    public void reordenar() {
        Collections.shuffle(cartaList, new Random(seed));
    }

    public Carta seleccionar() {
        Carta c=null;
        if(!cartaList.isEmpty()){
            c=cartaList.get(0);
            cartaList.remove(0);
        }
        return c;
    }
    
    public String toString(){
        StringBuffer strBuff;
        strBuff= new StringBuffer();
        for(Carta c:cartaList){
            strBuff.append(c.getValor()+" de " +c.getPinta()+"\n");
        }
        return strBuff.toString();
    }
}
