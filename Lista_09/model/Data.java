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
    }
}
