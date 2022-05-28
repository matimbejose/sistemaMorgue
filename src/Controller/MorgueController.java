package Controller;
import java.util.*;
import Model.Morgue;
import View.Table;

public class MorgueController {
    private Vector v;
    private Table td;
    private Gravardados gd;
 
    public MorgueController(){
        v = new Vector();
        td = new Table();
        gd = new Gravardados();
    }

    public  void recedados(){
      int codMorgue = geraCod.geraCod();
      int conta1 = Validacoes.ValidarInt("Imforme o contato da morgue : ", 999999999, 20000);
      String avenida = Validacoes.ValidarString("Imforme a avenida na qual a morgue esta localizada : ", 100, 2);
      Morgue mg = new Morgue(codMorgue, conta1, avenida);
      if(v.add(mg)){
        System.out.println("adicionado com sucesso");
    } else {
        System.out.println("erro no cadrasto");
    }
      v.trimToSize();
    }


    public void lerDoFic(String nameFil) {
        Lerdados lf =  new Lerdados();
        lf.LerdadosMorgue(v, nameFil);
    }

    public void gravarTxt(String nameFil) {
        gd.gravaMorgue(nameFil, v);
    }
    

    public void   listaM() {
        Morgue aux;
        td.setHeaders("Codigo", "Celuar","Avenida");
        for (int i = 0; i < v.size(); i++) {
            aux = (Morgue)v.elementAt(i);
            td.addRow(""+aux.getCodMorgue(),""+aux.getConta1(),""+aux.getAvenida());
        }
        td.showTable();
    }
    
}
