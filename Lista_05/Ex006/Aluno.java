package Lista_05.Ex006;

public class Aluno {

    private String nome;
    private long matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, long matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia(){
        return (this.nota1+this.nota2+this.nota3)/3;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" + "Matricula: " + matricula + "\n" + "nota 1: " + nota1 + "\n" + "nota 2: " + nota2 + "\n" + "nota 3: " + nota3;
    }

}
