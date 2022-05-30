package Controller;

import java.util.Vector;
import Model.Camera;
import Model.Corpo;
import Model.CorpoConh;
import Model.CorpoDes;
import Model.CorpoTrans;
import Model.Funcionario;
import Model.Morgue;

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

    public void  removeCorpo(Vector list, int  cod) {
        Corpo aux;
        CorpoConh cc;

       for(int i = 0; i < list.size(); i++) {
           aux =(Corpo)list.elementAt(i);
               if (aux instanceof CorpoConh) {
                   cc = (CorpoConh)aux;
                   if(cc.getCorpo() == cod) {
                       if(list.remove(cc)) {
                          System.out.println("removido com sucesso !");
                    }
                   }
           }
}
}


public void  removeCorpoD(Vector list, int  cod) {
    Corpo aux;
    CorpoDes cd;
   for(int i = 0; i < list.size(); i++) {
       aux =(Corpo)list.elementAt(i);
           if (aux instanceof CorpoDes) {
               cd = (CorpoDes)aux;
               if(cd.getCorpo() == cod) {
                   if(list.remove(cd)) {
                      System.out.println("removido com sucesso !");
                }
               }
       }
}
}

public void  removeCorpoT(Vector list, int  cod) {
    CorpoTrans ct;
   for(int i = 0; i < list.size(); i++) {
       ct = (CorpoTrans)list.elementAt(i);                
       if(ct.getCodCorpo() == cod) {
           if(list.remove(ct)) {
               System.out.println("removido com sucesso !");
           }
       }
    }
  }

  public void  removeF(Vector list, int  cod) {
    Funcionario  fun;
   for(int i = 0; i < list.size(); i++) {
       fun = (Funcionario)list.elementAt(i);                
       if(fun.getCodF() == cod) {
           if(list.remove(fun)) {
               System.out.println("removido com sucesso !");
           }
       }
    }
  }

  
  public void  removeM(Vector list, int  cod) {
      Morgue m;
   for(int i = 0; i < list.size(); i++) {
       m = (Morgue)list.elementAt(i);                
       if(m.getCodMorgue() == cod) {
           if(list.remove(m)) {
               System.out.println("removido com sucesso !");
           }
       }
    }
  }


}

