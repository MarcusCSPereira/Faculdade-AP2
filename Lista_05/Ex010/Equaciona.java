package Lista_05.Ex010;

public class Equaciona {
    
    private double a;
    private double b;
    private double c;

    public Equaciona() {
        this.a = 0.0;
        this.b = 0.0;
        this.c = 0.0;
    }

    public Equaciona(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolverEquacaoSegundoGrau() {
        double raiz1;
        double raiz2;
        if(b==0){
            raiz1 = Math.sqrt(c)/a;
            raiz2 = -1*raiz1;
            return "Duas raízes Reais: " + raiz1 + " e " + raiz2;
        }else if(a==0){
            raiz1 = c/b;
            return "Equação do primeiro grau, portanto uma raiz : " + raiz1;
        }else{
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                return "Duas raízes reais: " + raiz1 + " e " + raiz2;
            } else if (delta == 0) {
                double raiz = -b / (2 * a);
                return "Uma raiz real: " + raiz;
            } else {
                return "Nenhuma raiz real (raízes complexas)";
            }
        }
        
    }

}
