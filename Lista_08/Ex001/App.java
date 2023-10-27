public class App {
    public static void main(String[] args) {
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        conjunto1.insereElemento(10);
        conjunto1.insereElemento(20);
        conjunto1.insereElemento(30);

        conjunto2.insereElemento(20);
        conjunto2.insereElemento(30);
        conjunto2.insereElemento(40);

        System.out.println("Conjunto 1: " + conjunto1.toSetString());
        System.out.println("Conjunto 2: " + conjunto2.toSetString());

        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet interseccao = conjunto1.interseccao(conjunto2);
        System.out.println("Intersecção: " + interseccao.toSetString());

        conjunto1.deleteElemento(20);
        System.out.println("Conjunto 1 após exclusão do elemento 20: " + conjunto1.toSetString());

        boolean iguais = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Conjunto 1 e Conjunto 2 são iguais? " + iguais);
    }
}