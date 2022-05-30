package Controller;
import java.util.*;
import Model.Camera;
import View.Table;

public class CameraController {
    public Vector v;
    private Table td;
    private Lerdados ld;
    private Gravardados gd;
    private RemoverDados rd;
    private EditarDaddos ed;

    public CameraController() { 
        v = new Vector();
        td = new Table();
        ld = new Lerdados();
        gd = new Gravardados();
        rd = new RemoverDados();
        ed = new EditarDaddos();
    }

    public void  recedados(){
        int numero = Validacoes.ValidarInt("Imforme o numero da camera :  ", 100, 1);
        int codCorpo = Validacoes.ValidarInt("Imforme o codigo do corpo que estara na camera de numero "+numero+" : ", 9999, 2);
       Camera ca = new Camera(codCorpo, numero);
       if(v.add(ca)){
         System.out.println("adicionado com sucesso");
      } else {
        System.out.println("erro no cadrasto");
      }
       v.trimToSize();
    }

    public void GravarFich(String nameFil) {
        gd.gravaCamera(nameFil, v);
    }
    
    public void lerDoFic(String nameFil) {
        ld.LerDadosCamera(v, nameFil);
    }

    public void removeCamera(int numero) {
        rd.removeCamera(v, numero);
    }

    public void editaCamera(int cd) {
        ed.editaCamera(v, cd);
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
