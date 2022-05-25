package Controller;
import java.util.Vector;

import Model.Camera;

public class RemoverDados {
    
    public void removeCamera(Vector list, int  numero) {
        Camera aux;

       for(int i = 0; i < list.size(); i++) {
           aux =(Camera)list.elementAt(i);
           if(aux.getNumero() == numero) {
               if(list.remove(aux)) {
                   System.out.print("removido com sucesso !");
               }
           } 

       }

        }
   
    }

