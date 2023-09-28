package Lista_05.Ex003;

import java.time.LocalDate;

public class Carro {
    
    private String marca;
    private LocalDate anoFabr;
    private String modelo;

    Carro(LocalDate anoFabr, String marca, String modelo){
        this.anoFabr = anoFabr;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public LocalDate getAnoFabr() {
        return anoFabr;
    }
    public void setAnoFabr(LocalDate anoFabr) {
        this.anoFabr = anoFabr;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString(){
        return "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Ano de Fabricação: " + anoFabr;
    }


}
