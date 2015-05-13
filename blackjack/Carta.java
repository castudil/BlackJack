package blackjack;

public class Carta {
    private final ValorEnum valor;
    private final PintaEnum pinta;



    public Carta(ValorEnum valor,PintaEnum pinta) {
        this.valor=valor;
        this.pinta=pinta;
    }

    public PintaEnum getPinta() {
        return pinta;
    }

    public ValorEnum getValor() {
        return valor;
    }
}
