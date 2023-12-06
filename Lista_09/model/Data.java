package Lista_09.model;

public class Data {
    private int dia;
    private int mes;
    private int ano;

   public Data(String dataCompleta){
        String[] dataSplit = dataCompleta.split("/");
        this.dia = Integer.parseInt(dataSplit[0]);
        this.mes = Integer.parseInt(dataSplit[1]);
        this.ano = Integer.parseInt(dataSplit[2]);
        //Método de formatação da Data, pois eu recebo a data no formato String da seguinte forma: dd/mm/aaaa e preciso separar os valores e atribuir aos atributos da Classe Data
    }

    @Override
    public String toString(){
        if(dia<10 && mes<10)
            return "0"+dia+"/0"+mes+"/"+ano;
        else if(dia<10)
            return "0"+dia+"/"+mes+"/"+ano;
        else if(mes<10)
            return dia+"/0"+mes+"/"+ano;
        else
            return dia+"/"+mes+"/"+ano;
        /*Aqui no meu método toString eu retorno a data formatada, caso o dia ou o mês sejam menores que 10, eu concateno um 0 na frente do dia ou do mês, para que a data fique no formato dd/mm/aaaa, por isso o controle do if/else.*/
    }
}
