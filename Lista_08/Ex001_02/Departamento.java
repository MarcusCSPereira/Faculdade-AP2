import java.util.ArrayList;

public class Departamento {
    private String nome;
    private String sigla;
    private String telefone;

    ArrayList<Professor> professores;

    Departamento(String nome,String sigla,String telefone){
        this.nome = nome;
        this.sigla = sigla;
        this.telefone = telefone;
        professores = new ArrayList<Professor>();
    }
    
    
    public boolean adicionarProfessores(Professor p){   
        if(buscarProfessores(p.getCpf())==null){
            professores.add(p);
            return true;
        }else{
            return false;
        }
    }
    
    public Professor buscarProfessores(Long cpf){
        for (Professor p : professores) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    public boolean demitirProfessores(Long cpf){
        Professor p = buscarProfessores(cpf);
        if(p!=null){
            professores.remove(p);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<Professor> informarProfessores(){
        return professores;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString(){
        return "Nome: " + this.nome + " | Sigla: " + this.sigla + " | Telefone: " + this.telefone + "\n";
    }

}
