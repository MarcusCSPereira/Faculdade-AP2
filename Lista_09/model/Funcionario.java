package Lista_09.model;

public class Funcionario extends Pessoa{//Funcionario herda de Pessoa
    private float salario;//Atributo exclusivo de Funcionario

    public Funcionario(String nome, Data nascimento, float salario){
        super(nome, nascimento);//Uso do super para acessar o construtor da Classe Pai, que é Pessoa, adicionando assim o nome e a data de nascimento do Funcionario.
        this.salario=salario;
    }

    public float getSalario(){
        return salario;
    }

    @Override//Aqui sobreponho o método imprimeDados da Classe Pessoa, pois Funcionario é uma Classe filha de Pessoa, e como Funcionario tem um atributo exclusivo, que é o salario, eu preciso imprimir ele também.
    public void imprimeDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de Nascimento: " + super.getDataNascimento());
        System.out.println("Profissão: " + this.getClass().getSimpleName());
        System.out.println("Salário antes do imposto: " + salario);
        System.out.println("Imposto sobre o salario: " + calculaImposto());
        System.out.println("Salário após imposto: "+ (salario-calculaImposto()));
    }

    public float calculaImposto(){//Método para calcular o imposto sobre o salario do Funcionario
        return salario*3/100;
    }

}
