package Lista_09.model;

public class Gerente extends Funcionario{//Gerente herda de Funcionario, mas como Funcionario herda de Pessoa, Gerente herda de Pessoa também.
    private String area;

    public Gerente(String nome, Data nascimento, float salario, String area){
        super(nome, nascimento, salario);//Uso do super para acessar o construtor da Classe Pai, que é Funcionario, adicionando assim o nome, a data de nascimento e o salario do Gerente.
        this.area=area;
    }

    @Override
    public void imprimeDados() {
        super.imprimeDados();//Aqui eu chamo o método imprimeDados da Classe Funcionario, que é a Classe Pai de Gerente, para imprimir os dados de Funcionario, que são os dados de Pessoa e o salario, porém quando ele chama o método calculaImposto(), dentro desse super, ele vai chamar o método calculaImposto() da classe Gerente.
        System.out.println("Área: " + this.area);
    }
    
    @Override
    public float calculaImposto(){//Aqui eu sobrescrevo o método calculaImposto() da Classe Funcionario.
        return (super.getSalario()*5/100);
    }
}
