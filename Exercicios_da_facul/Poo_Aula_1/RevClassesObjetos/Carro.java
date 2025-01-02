package Poo_Aula_1.RevClassesObjetos;
public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    public Carro(String marca, String modelo, String cor, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public String toString(){
        return "Marca: " + marca + ", Modelo: " + modelo + ", Cor: " + cor + ", Placa: " + placa;
    }
    
}