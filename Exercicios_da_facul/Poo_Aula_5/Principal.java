package Poo_Aula_5;

public class Principal {
    public static void main(String[] args) {
        // Declaração e inicialização correta do vetor de imóveis
        Imovel[] imoveis = new Imovel[10]; // Corrigido para alocar um vetor de Imoveis

        // Instanciando o Imóvel, Casa, e Prédio conforme solicitado
        Imovel nadamovel = new Imovel(60, "Rua Professor Legal, 10");
        Casa casinha = new Casa(60, "Rua Professor Legal, 10");
        Predio predin = new Predio(540, "Rua Professor Legal, 18", 6);

        // Armazenando os objetos no vetor
        imoveis[0] = nadamovel;
        imoveis[1] = casinha;
        imoveis[2] = predin;

        // Testando a igualdade estrutural entre os objetos
        // Teste 1: Imóvel vs Casa
        if (nadamovel.equals(casinha)) {
            System.out.println("Imóvel e Casa são Idênticos.");
        } else {
            System.out.println("Imóvel e Casa são Diferentes.");
        }

        // Teste 2: Imóvel vs Prédio
        if (nadamovel.equals(predin)) {
            System.out.println("Imóvel e Prédio são Idênticos.");
        } else {
            System.out.println("Imóvel e Prédio são Diferentes.");
        }

        // Teste 3: Casa vs Prédio
        if (casinha.equals(predin)) {
            System.out.println("Casa e Prédio são Idênticos.");
        } else {
            System.out.println("Casa e Prédio são Diferentes.");
        }
    }
}
