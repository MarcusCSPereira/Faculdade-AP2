package Lista_09.model;

public class Cliente extends Pessoa {
    private int codigo;

    public Cliente(String nome, Data dataNascimento, int codigo) {
        super(nome, dataNascimento);
        this.codigo = codigo;
    }

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de Nascimento: " + super.getDataNascimento());
        System.out.println("Tipo: Cliente");
        System.out.println("Código: " + this.codigo);
    }
}
