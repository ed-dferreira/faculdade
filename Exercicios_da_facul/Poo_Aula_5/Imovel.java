package Poo_Aula_5;

import java.util.Objects;

public class Imovel {
    private double areaConstruida;
    private String endereco;

    public Imovel(double areaConstruida, String endereco) {
        this.areaConstruida = areaConstruida;
        this.endereco = endereco;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Imovel imovel = (Imovel) o;
        return Double.compare(imovel.areaConstruida, areaConstruida) == 0 &&
                Objects.equals(endereco, imovel.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaConstruida, endereco);
    }
}
