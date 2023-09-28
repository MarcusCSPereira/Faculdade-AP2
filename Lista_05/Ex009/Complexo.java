package Lista_05.Ex009;

public class Complexo {
    private double parteReal;
    private double parteImaginaria;

    public Complexo() {
        this.parteReal = 0.0;
        this.parteImaginaria = 0.0;
    }

    public Complexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }


    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }


    public double getParteImaginaria() {
        return parteImaginaria;
    }


    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }


    public Complexo somar(Complexo object) {
        double novaParteReal = this.parteReal + object.getParteReal();
        double novaParteImaginaria = this.parteImaginaria + object.getParteImaginaria();
        return new Complexo(novaParteReal, novaParteImaginaria);
    }

    public boolean equals(Complexo object) {
        return this.parteReal == object.getParteReal() &&
               this.parteImaginaria == object.getParteImaginaria();
    }

    @Override
    public String toString() {
        return parteReal + " + " + parteImaginaria + "i";
    }
}