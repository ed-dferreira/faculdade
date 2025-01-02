package Poo_Aula_1.RevClassesObjetos;
public class Principal {
    public static void main(String[] args) {
        Estacionamento vaga = new Estacionamento("Rua Avestruz", 90001007);

        vaga.adicionarCarro(new Carro("Hyundai", "HB20", "preto", "BEE4F00"));
        vaga.adicionarCarro(new Carro("Chevrolet", "Onix", "cinza", "FUN2M33"));
        vaga.adicionarCarro(new Carro("Ford", "Ka", "vermelho", "GEZ0W35"));

        System.out.println(vaga.toString());

        Carro[] carros = vaga.getVagas();
        for (Carro carro : carros) {
            if (carro != null) {
                System.out.println(carro.toString());
            }
        }
    }
}
