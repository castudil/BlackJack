package blackjack;

public class Triangulo {

    private double altura;

    private double base;

    public double calcularArea() {
        return altura*base/2.0;
    }

    public void setAltura(double altura) {
        this.altura=altura;
    }

    public void setBase(double base) {
        this.base=base;
    }
}
