package Lista_05.Ex005;

public class Triangulo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea(){
        return (this.base*this.altura)/2;
    }

}
