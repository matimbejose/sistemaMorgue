package Controller;
import java.util.*;
import Model.Camera;
import View.Table;

public class CameraController {
    public Vector v;
    private Table td;

    public CameraController() { 
        v = new Vector();
        td = new Table();
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

    public void removeCamera(int numero) {
        RemoverDados rm = new RemoverDados();
        rm.removeCamera(v, numero);
    }
    
    public void   listaCamera() {
        Camera aux;
        td.setHeaders("Codigo do corpo","Numero da camera");
        for (int i = 0; i < v.size(); i++) {
            aux = (Camera)v.elementAt(i);
            td.addRow(""+aux.getCodCorpo(),""+aux.getNumero());
        }
        td.showTable();
    }

}
