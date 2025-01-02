package Poo_Aula_5;
import java.util.Objects;

public class Casa extends Imovel {
    public Casa(double areaConstruida, String endereco) {
        super(areaConstruida, endereco); // Corrigido para chamar o construtor da superclasse
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casa casa = (Casa) o;
        return Double.compare(casa.getAreaConstruida(), getAreaConstruida()) == 0 &&
                Objects.equals(getEndereco(), casa.getEndereco());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAreaConstruida(), getEndereco());
    }
}
