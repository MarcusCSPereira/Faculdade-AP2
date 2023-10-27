package Agenda;

import java.util.ArrayList;

public class Agenda {
     
    ArrayList<Contato> contatos;
     
     public Agenda() {
    	 contatos = new ArrayList<Contato>();
     }
     
     public boolean incluirContato(Contato c)
     {
    	 if (pesquisarContato(c.getCpf()) == null)
         {
    	      contatos.add(c);
    	      return true;
         }
    	 
    	 return false;
    	      
    	    	 
     }
     
     public Contato pesquisarContato(String cpf)
     {
    	 for (Contato c : contatos)
    		 if (c.getCpf().equals(cpf))
    			 return c;
    	 return null;
     }

     public boolean excluirContato(String cpf){
            Contato c = pesquisarContato(cpf);
            if(c!=null){
                contatos.remove(c);
                return true;
            }else{
                return false;
            }
        }
        
     
     public ArrayList<Contato> listarContatos()
     {
    	return contatos; 
     }

     public String econtrarPosicao(Contato c) {
    	 return Integer.toString(contatos.indexOf(c)+1);
     }
}