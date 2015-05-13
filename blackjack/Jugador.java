package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Jugador {

    private int sumaTotal;

    private String nombre;
    
    private List<Carta> mano; // mano de cartas
    
    private Baraja baraja;
    
    private BlackJack bj;
    private boolean continua;// continua jungando?
    

    public Jugador(BlackJack bj, String nombre) {
        this.bj=bj;
        this.baraja=bj.b;
        mano=new ArrayList(); // mano de cartas vacias
        continua=true;
        this.nombre=nombre;
    }

    public Carta robar() {
        Carta c=null;
        if(continua){
            c=baraja.seleccionar();
            if(c!=null){
                mano.add(c); // agregar una carta a la mano
            }
        }
        return c;
    }

    public void detener() {
        continua=false;
    }

    public String getNombre() {
        return nombre;
    }

    int calcularPuntaje(){
       sumaTotal=0;
       for(Carta c:mano){
           sumaTotal+=c.getValor().ordinal()+1;
       }
       if (sumaTotal>=21){
           continua=false;
       }
       return sumaTotal;
    }
    
    
    boolean getContinua(){
        return continua;
    }
    
    public String toString(){
        StringBuffer strBuff;
        strBuff = new StringBuffer();
        strBuff.append(nombre+":"+calcularPuntaje()+":");
        for(Carta c:mano){
            strBuff.append(c.getValor()+" de "+c.getPinta()+", ");
        }
        return strBuff.toString();
    }


}
