package Lista_09.model;

public class Cliente extends Pessoa {// Faço Cliente herdar de Pessoa por meio do extends
    private int codigo;// Atributo exclusivo de Cliente, porém quando ele extende Pessoa, ele herda os atributos de Pessoa, que seriam os nomes e a data de nascimento.

    public Cliente(String nome, Data dataNascimento, int codigo) {
        super(nome, dataNascimento);//Uso do super para acessar o construtor da Classe Pai, que é Pessoa, adicionando assim o nome e a data de nascimento do Cliente.
        this.codigo = codigo;
    }

    @Override//Aqui sobreponho o método imprimeDados da Classe Pessoa, pois Cliente é uma Classe filha de Pessoa, e como Cliente tem um atributo exclusivo, que é o código, eu preciso imprimir ele também.
    public void imprimeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Tipo: Cliente");
        System.out.println("Código: " + this.codigo);
    }
}
