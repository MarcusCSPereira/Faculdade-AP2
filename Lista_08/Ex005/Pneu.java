package Ex005;

public class Pneu {
    private int tipo;
    private String fabricante;
    private double preço;

    Pneu (int tipo) {
        this.tipo = tipo;
        switch (this.tipo) {
            case 1:
                this.fabricante = "Pirelli";
                this.preço = 100;
            break;
            case 2:
                this.fabricante = "Michelin";
                this.preço = 200;
            break;
            case 3:
                this.fabricante = "Goodyear";
                this.preço = 300;
            break;
            case 4:
                this.fabricante = "Firestone";
                this.preço = 400;
            break;
            default:
                System.out.println("Tipo de pneu inválido!");
                break;
        }
    }

    public double getPreço() {
        return preço;
    }

    @Override
    public String toString(){
        return "Pneu: "+fabricante + " | Preço da unidade: "+preço;
    }



}
