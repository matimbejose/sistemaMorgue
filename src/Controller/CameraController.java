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

    public CameraController() { 
        v = new Vector();
        td = new Table();
        ld = new Lerdados();
        gd = new Gravardados();
        rd = new RemoverDados();
    }

    public void  recedados(){
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<<Cadastro de Corpos na Camara >>>>>>>>>>>>>>>>>>>>>>>>>>");
        int numero = Validacoes.ValidarInt("Numero da camara: ", 100, 1);
        int codCorpo = Validacoes.ValidarInt("codigo do corpo: ", 9999, 2);
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

 

    public void   listaCamera() {
        Camera aux;
        td.setHeaders("Codigo do corpo","Numero da camara");
        for (int i = 0; i < v.size(); i++) {
            aux = (Camera)v.elementAt(i);
            td.addRow(""+aux.getCodCorpo(),""+aux.getNumero());
        }
        td.showTable();
    }

}
