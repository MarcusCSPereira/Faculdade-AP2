package Lista_09.controller;

import java.util.Arrays;

import Lista_09.model.*;//Importo todas as classes do pacote model, pois como está em um pacote diferente do pacote model, eu preciso importar para poder usar as classes do pacote model.

public class CadastroPessoa {
    //Atributos e o Array de Pessoas
    private int qtdAtual;
    private int qtdMaxima;
    Pessoa[] pessoas;

    public CadastroPessoa(int qtdMaxima){
        //Construtor, onde eu recebo a quantidade máxima de pessoas que podem ser cadastradas e crio o Array de Pessoas com essa quantidade máxima.
        this.qtdMaxima = qtdMaxima;
        this.qtdAtual = 0;
        this.pessoas = new Pessoa[qtdMaxima];
    }

    public int getQtdAtual(){//Métodoo para retornar a quantidade atual de pessoas no cadastro.
        return qtdAtual;
    }

    public int getQtdMaxima(){//Método para retornar quantidade máxima de pessoas cadastradas.
        return qtdMaxima;
    }

    
    public Pessoa buscaPessoa(String nome){//Método para buscar uma pessoa no cadastro pelo nome, usado para controle de não adicionar pessoas com o mesmo nome no cadastro.
        for (int i = 0; i < qtdAtual; i++) {
            if(pessoas[i].getNome().equals(nome)){
                return pessoas[i];
            }
        }
        return null;
    }
    
    public void cadastraPessoa(Pessoa p){
        //Método para cadastrar uma pessoa no Array de Pessoas, onde eu recebo uma pessoa e verifico se ela já está cadastrada, caso não esteja, eu adiciono ela no Array de Pessoas, retornando uma mensagem de confirmação ou erro de cadastro.
        if(buscaPessoa(p.getNome())==null){
            pessoas[qtdAtual] = p;
            qtdAtual++;
            System.out.println("\nPessoa cadastrada com sucesso");
        }else{
            System.out.println("\nErro: Pessoa já cadastrada");
        }
    }

    public void imprimeCadastro(){
        //Método para imprimir o cadastro, onde eu verifico se há pessoas cadastradas, caso não haja, eu retorno uma mensagem de erro, caso haja, eu imprimo os dados de todas as pessoas cadastradas.
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
