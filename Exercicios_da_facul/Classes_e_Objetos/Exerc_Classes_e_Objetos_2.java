package Classes_e_Objetos;
public class Exerc_Classes_e_Objetos_2 {
    public static void main(String[] args) {
        class Animal {
            private String especie;
            private String nomeCientifico;
            private double pesoMedio;

            public Animal(String especie, String nomeCientifico, double pesoMedio) {
                this.especie = especie;
                this.nomeCientifico = nomeCientifico;
                this.pesoMedio = pesoMedio;
            }

            public String toString() {
                return "Espécie: " + especie + ", Nome Científico: " + nomeCientifico + ", Peso Médio: " + pesoMedio + " kg";
            }
        }

        // Criando objetos da classe interna Animal
        Animal animal1 = new Animal("peixe-bolha", "psychrolutes marcidus", 0.6);
        Animal animal2 = new Animal("ornitorrinco", "ornithorhynchus anatinus", 1.25);
        Animal animal3 = new Animal("toupeira-nariz-de-estrela", "condylura cristata", 0.3);
        Animal animal4 = new Animal("uacari-branco", "cacajao calvus", 3.1);

        // Exibindo as informações dos objetos criados
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
    }
}
