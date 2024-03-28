package org.example;

public class Trem extends Transporte{
    private float velocidadeEntrega;
    public Trem (float lucroBase) {
        super(lucroBase);
    }
    public void setVelocidadeEntrega(float velocidadeEntrega) {
        this.velocidadeEntrega = velocidadeEntrega;
    }
    @Override
    public float calcularLucro() {
        return this.lucroBase * this.velocidadeEntrega * (1 + this.carga.calcularPercentual());
    }


}
