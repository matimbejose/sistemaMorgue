package Controller;
import Model.*;
import java.util.*;

public class CorposTransController  {
    private  Vector v;
   

    public CorposTransController() {
        v = new Vector();
    }
    
    
    public  void recebeDadoCorpo() {
    int  codCorpo = Validacoes.ValidarInt("Imforme o codigo do corpo : ", 100, 1);
    char tipoCorp = Validacoes.validarChar("Conhecido c-/d-desconhecido : ", 3, 1);
    CorpoTrans cTrans = new  CorpoTrans(codCorpo,tipoCorp);
    v.addElement(cTrans);
    v.trimToSize();
    }

    

    public void lerDoFic(String nameFil) {
        Lerdados l = new Lerdados();
        // l.LerDados(v, nameFil);
    }

    
    public void GravarFich(String nameFil) {
        Gravardados g = new  Gravardados();
        // g.grava(nameFil, v);
     }



    //venho dar um jeito  
    public String  toString() {
        String  x = " ";
        Camera aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (Camera)v.elementAt(i);
            x = x + aux + "\n";
        }
        return x;
    }


    

}

