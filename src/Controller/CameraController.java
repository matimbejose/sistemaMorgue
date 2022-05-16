package Controller;
import java.util.*;
import Model.Camera;

public class CameraController {
    public Vector v;

    public CameraController() { 
        v = new Vector();
    }

    public void  recedados(){
        int numero = Validacoes.ValidarInt("Imforme o numero da camera :  ", 100, 1);
        int codCorpo = Validacoes.ValidarInt("Imforme o codigo do corpo que estara na camera de numero "+numero+" : ", 9999, 2);
       Camera ca = new Camera(codCorpo, numero);
       v.addElement(ca);
       v.trimToSize();
    }

    public void GravarFich(String nameFil) {
        Gravardados g = new  Gravardados();
        g.gravaCamera(nameFil, v);
     
    }
    
    public void lerDoFic(String nameFil) {
        Lerdados l = new Lerdados();
        l.LerDadosCamera(v, nameFil);
    }
    
    public String  toString() {
        String  x = " ";
        Camera aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (Camera)v.elementAt(i);
            x = aux.toString() + x + "\n";
        }
        return x;
    }

}
