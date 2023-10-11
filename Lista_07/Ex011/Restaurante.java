package Lista_07.Ex011;

public class Restaurante {
    
    private String nome;
    private String endereco;
    private double precoMed;
    private String foodType;


    public Restaurante() {
    }

    public Restaurante(String nome, String endereco, double precoMed, String foodType) {
        this.nome = nome;
        this.endereco = endereco;
        this.precoMed = precoMed;
        this.foodType = foodType;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPrecoMed() {
        return precoMed;
    }

    public void setPreçoMed(double precoMed) {
        this.precoMed = precoMed;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Override
    public String toString(){
        return "Restaurante: " + nome + "\n" + "Tipo de comida: " + foodType + "\n" + "Preço médio: " + precoMed + "\n" + "Endereço: " + endereco + "\n";
    }


}
