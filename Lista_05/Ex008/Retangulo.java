package Lista_05.Ex008;

public class Retangulo {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return (this.base*this.altura);
    }

}
