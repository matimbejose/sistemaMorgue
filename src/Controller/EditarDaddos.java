package Controller;

import java.util.Vector;
import Model.Camera;
import Model.Corpo;
import Model.CorpoConh;
import Model.CorpoDes;
import Model.CorpoTrans;
import Model.Funcionario;
import Model.Morgue;

public class EditarDaddos {

    public void editaCamera(Vector list, int  cod) {
        Camera aux;
       for(int i = 0; i < list.size(); i++) {
           aux =(Camera)list.elementAt(i);
           if(aux.getCodCorpo() == cod) {
               int numero = Validacoes.ValidarInt("Imforme o novo numero da camara : ", 100, 1);
               aux.setNumero(numero);
           } 
       }
}

public void editaM(Vector list, int  cod) {
    Morgue aux;
   for(int i = 0; i < list.size(); i++) {
       aux =(Morgue)list.elementAt(i);
       if(aux.getCodMorgue() == cod) {
           int conta = Validacoes.ValidarInt("Imforme o novo numero de celular : ", 999999999, 20000);
           aux.setConta1(conta);
       } 
   }
}

public void editaC(Vector list, int  cod) {
    Corpo ob;
    CorpoConh aux;
   for(int i = 0; i < list.size(); i++) {
       ob  =(Corpo)list.elementAt(i);
       if (ob instanceof CorpoConh) {
           aux = (CorpoConh)ob;
           if(aux.getCorpo() == cod) {
             String  nomePante = Validacoes.ValidarString("Imforme o novo nome do parente : ", 999999999, 3);
             aux.setNomeParente(nomePante);
            } 
       }
   }
}

public void editaD(Vector list, int  cod) {
    Corpo ob;
    CorpoDes aux;
   for(int i = 0; i < list.size(); i++) {
       ob  =(Corpo)list.elementAt(i);
       if (ob instanceof CorpoDes) {
           aux = (CorpoDes)ob;
           if(aux.getCorpo() == cod) {
             String  marcasPele = Validacoes.ValidarString("Imforme as novas  na pele  : ", 999999999, 3);
             aux.setMarcasPele(marcasPele);
            } 
       }
   }
}

public void editaF(Vector list, int  cod) {
    Funcionario f;
   for(int i = 0; i < list.size(); i++) {
       f = (Funcionario)list.elementAt(i);
       if(f.getCodF() == cod) {
           String funcao = Validacoes.ValidarString("Imforme a nova funcao  : ", 1000, 3);
           f.setFuncao(funcao);
       }
   }
}


public void editaT(Vector list, int  cod) {
    CorpoTrans ct;
   for(int i = 0; i < list.size(); i++) {
       ct  = (CorpoTrans)list.elementAt(i);
       if(ct.getCodCorpo()  == cod) {
            int codMorgue  = Validacoes.ValidarInt("Imforme o novo codigo da morgue : ", 9999, 1000); 
           ct.setCodMorgue(codMorgue);           
       }
   }
}







}
