package Lista_05.Ex003;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate dataAtual =  LocalDate.now();
        
        Carro c1 = new Carro(dataAtual,"Mitsubish","Nissan");

        System.out.println(c1);
    }
}
