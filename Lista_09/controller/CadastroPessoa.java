package Lista_09.controller;

import Lista_09.model.Pessoa;

public class CadastroPessoa {
    private int qtdAtual;
    private int qtdMaxima;
    Pessoa[] pessoas;

    public CadastroPessoa(int qtdMaxima){
        this.qtdMaxima = qtdMaxima;
        this.qtdAtual = 0;
        this.pessoas = new Pessoa[qtdMaxima];
    }

    public int getQtdAtual(){
        return qtdAtual;
    }

    public int getQtdMaxima(){
        return qtdMaxima;
    }

    
    public Pessoa buscaPessoa(String nome){
        for (int i = 0; i < qtdAtual; i++) {
            if(pessoas[i] == null){
                return null;
            }
            if(pessoas[i].getNome().equals(nome)){
                return pessoas[i];
            }
        }
        return null;
    }
    
    public void cadastraPessoa(Pessoa p){
        if(buscaPessoa(p.getNome())==null){
            pessoas[qtdAtual] = p;
            qtdAtual++;
            System.out.println("\nPessoa cadastrada com sucesso");
        }else{
            System.out.println("Erro: Pessoa já cadastrada");
        }
    }

    public void imprimeCadastro(){
        if(qtdAtual == 0){
            System.out.println("Não há pessoas cadastradas");
            return;
        }
        for (int i = 0; i < qtdAtual; i++) {
            System.out.println();
            pessoas[i].imprimeDados();
        }
    }

}
