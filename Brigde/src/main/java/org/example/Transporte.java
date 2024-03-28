package org.example;

public abstract class Transporte {
    protected Carga carga;
    protected float lucroBase;

    public Transporte(float lucroBase){
        this.lucroBase = lucroBase;
    }

    public void setEntrega(Carga carga){
        this.carga = carga;
    }
    public void setLucroBase(float lucroBase){
        this.lucroBase = lucroBase;
    }

    public abstract float calcularLucro();

}
