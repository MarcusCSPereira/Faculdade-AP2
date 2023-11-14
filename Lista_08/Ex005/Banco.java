package Ex005;

public class Banco {
    private String modelo;
    private String fabricante;
    private double preço;

    Banco (String fabricante) {
        this.fabricante = fabricante;
        switch (fabricante) {
            case "Fiat":
                this.modelo = "Confort";
                this.preço = 1000;
                break;
            case "Ford":
                this.modelo = "Sport";
                this.preço = 2000;
                break;
            case "Chevrolet":
                this.modelo = "Couro";
                this.preço = 3000;
                break;
            case "Volkswagen":
                this.modelo = "Luxo";
                this.preço = 4000;
                break;
            default:
                break;
        }
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public String toString(){
        return "Banco: "+fabricante+" | Preço: "+preço + " | Modelo: "+modelo;
    }
}
