package Poo_Aula_1.RevClassesObjetos;
public class Estacionamento {
    private String endereco;
    private long cep;
    private Carro[] vagas;  
    public int quantidadeCarros;  

    public Estacionamento(String endereco, long cep) {
        this.endereco = endereco;
        this.cep = cep;
        this.vagas = new Carro[50];  
        this.quantidadeCarros = 0;   
    }
    public Carro[] getVagas() {
        return vagas;
    }
    public void setVagas(Carro[] vagas) {
        this.vagas = vagas;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public boolean adicionarCarro(Carro carro) {
        for (int i = 0; i < vagas.length; i++){
            if (vagas[i]==null){
                quantidadeCarros++;
            } 
        }
        if (quantidadeCarros < 50){
            for(int i = 0; i < vagas.length; i++){
                if (vagas[i]==null){
                    vagas[i]= carro;
                    break;
                }
            }
        }
        if (quantidadeCarros < 50) {
            Carro mareaTurboSovietico = new Carro("FIAT", "Marea Turbo", "Preto",
             "BOM-9999");
            vagas[49] = mareaTurboSovietico;
            return true;
        } else {
            return false;
        }
    }

    public void carrosNoEstacionamento(){
        for (int i = 0; i < vagas.length; i++){
            if (vagas[i]!=null){
                Carro carro = vagas[i];
                System.out.println(carro.toString());
                System.out.println();
            }
        }
    }

    public String toString() {
        return "Está no estacionamento da rua " + endereco + ", " + cep;
    }  
} 
