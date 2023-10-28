public class Professor {
    
    private String nome;
    private Long cpf;   
    private String disciplina;
    private String dataDeNascimento; 
    
    Professor(String nome, Long cpf, String disciplina, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.disciplina = disciplina;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString(){
        return "\nNome: " + this.nome + " | CPF: " + this.cpf + " | Disciplina: " + this.disciplina + " | Data de Nascimento: " + this.dataDeNascimento;
    }

}
