package blackjack;

public class BlackJackApp {

    
    public static void main(String[] args) {
    BlackJack bj;
    bj= new BlackJack();
    //bj.init();
    bj.agregarJugador("Casa");
    bj.agregarJugador("Pepito");
    bj.agregarJugador("Juanito");
    while(bj.hayGanador()!=null){
        bj.step();
        }
    }
}
