package Poo_Aula_5;

import java.util.Objects;

public class Predio extends Imovel {
    private int andares;

    public Predio(double areaConstruida, String endereco, int andares) {
        super(areaConstruida, endereco); 
        this.andares = andares;
    }

    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predio predio = (Predio) o;
        return andares == predio.andares;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), andares);
    }
}
