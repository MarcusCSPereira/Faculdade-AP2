package Lista_10.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import Lista_10.model.Livro;
import Lista_10.model.Produto;

public class Tela {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        String resultado = "";
        produtos.add(new Livro("Java Como Programar", "Deitel", 1000, 300));
        produtos.add(new Produto("Lapis preto", 2));
        produtos.add(new Produto("Caneta azul", 3.5));
        produtos.add(new Livro("A hora da estrela", "Clarice Lispector", 120, 37.8));
        for (int i = 0; i < produtos.size(); i++) {
            resultado = resultado + produtos.get(i).toString() + "\n--------\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}