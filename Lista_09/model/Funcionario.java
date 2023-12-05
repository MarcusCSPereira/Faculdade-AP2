package Lista_09.model;

public class Funcionario extends Pessoa{
    private float salario;

    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);
        this.salario=salario;
    }

    public float getSalario(){
        return salario;
    }

    @Override
    public void imprimeDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de Nascimento: " + super.getDataNascimento());
        System.out.println("Profissão: " + this.getClass().getSimpleName());
        System.out.println("Salário antes do imposto: " + salario);
        System.out.println("Imposto sobre o salario: " + calculaImposto());
        System.out.println("Salário após imposto: "+ (salario-calculaImposto()));
    }

    public float calculaImposto(){
        return salario*3/100;
    }

}
