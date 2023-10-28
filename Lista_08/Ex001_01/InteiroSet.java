import java.util.ArrayList;

public class InteiroSet {
    
    Boolean conjunto[];

    public InteiroSet() {
        conjunto = new Boolean[101];
        for (int i = 0; i < 101; i++) {
            conjunto[i] = false;
        }
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet uniao = new InteiroSet();
        for (int i = 0; i < 101; i++) {
            uniao.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return uniao;
    }

    public InteiroSet interseccao(InteiroSet outroConjunto) {
        InteiroSet interseccao = new InteiroSet();
        for (int i = 0; i < 101; i++) {
            interseccao.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return interseccao;
    }

    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    public String toSetString() {
        ArrayList<Integer> elementos = new ArrayList<Integer>();
        for (int i = 0; i < 101; i++) {
            if (conjunto[i]) {
                elementos.add(i);
            }
        }
        if (elementos.size() == 0) {
            return "-";
        } else {
            String setString = "";
            for (int i = 0; i < elementos.size() - 1; i++) {
                setString += elementos.get(i) + " ";
            }
            setString += elementos.get(elementos.size() - 1);
            return setString;
        }
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i < 101; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}