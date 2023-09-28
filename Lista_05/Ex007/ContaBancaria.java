package Lista_05.Ex007;

public class ContaBancaria {
    
    private static int agencia=0;
    private double saldo;

    
    public ContaBancaria(double saldo) {
        agencia++;
        this.saldo = saldo;
    }

    public void depositar(int valor){
        this.saldo+=valor;
    }

    public void sacar(int valor){
        if(this.saldo < valor ){
            System.out.println("Você não possui saldo suficiente");
        }else{
            this.saldo-=valor;
        }
    }

    public double verificarSaldo(){
        return this.saldo;
    }

    @Override
    public String toString(){
        return "Agência: " + agencia + "\n" + "Saldo: " + saldo;
    }



    
}
