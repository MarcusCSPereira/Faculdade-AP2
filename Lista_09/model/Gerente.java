package Lista_09.model;

public class Gerente extends Funcionario{
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area){
        super(nome, nascimento, salario);
        this.area=area;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Área: " + this.area);
    }
    
    @Override
    public float calculaImposto(){
        return (super.getSalario()*5/100);
    }
}
