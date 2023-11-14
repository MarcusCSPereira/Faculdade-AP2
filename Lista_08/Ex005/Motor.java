package Ex005;

public class Motor {
    private String fabricante;
    private int potencia;
    private double preço;

    Motor (String fabricante) {
        this.fabricante = fabricante;
        switch (fabricante) {
            case "Fiat":
                this.potencia = 100;
                this.preço = 10000;
            break;
            case "Ford":
                this.potencia = 200;
                this.preço = 20000;
            break;
            case "Chevrolet":
                this.potencia = 300;
                this.preço = 30000;
            break;
            case "Volkswagen":
                this.potencia = 400;
                this.preço = 40000;
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
        return "Motor: "+fabricante+" | Preço: "+preço + " | Potência: "+potencia;
    }
}
