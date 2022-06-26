package Controller;
import java.util.*;
import Model.Morgue;
import View.Table;

public class MorgueController {
    private Vector v;
    private Table td;
    private Gravardados gd;
    private Lerdados lf;
    private RemoverDados rd;

    public MorgueController(){
        v = new Vector();
        td = new Table();
        gd = new Gravardados();
        lf = new Lerdados();
        rd = new RemoverDados();
    }

    public  void recedados(){
      int codMorgue = geraCod.geraCod();
      int conta1 = Validacoes.ValidarInt("Informe o contato da morgue: ", 999999999, 20000);
      String avenida = Validacoes.ValidarString("Informe a avenida na qual a morgue esta localizada: ", 100, 2);
      Morgue mg = new Morgue(codMorgue, conta1, avenida);
      if(v.add(mg)){
        System.out.println("ADICIONADO COM SUCESSO");
    } else {
        System.out.println("ERRO NO CADASTRO");
    }
      v.trimToSize();
    }


    public void lerDoFic(String nameFil) {
        lf.LerdadosMorgue(v, nameFil);
    }

    public void gravarTxt(String nameFil) {
        gd.gravaMorgue(nameFil, v);
    }

    public void removeM(int cod) {
        rd.removeM(v, cod);
    }

    public void   listaM() {
        Morgue aux;
        td.setHeaders("Codigo", "CeluLar","Avenida");
        for (int i = 0; i < v.size(); i++) {
            aux = (Morgue)v.elementAt(i);
            td.addRow(""+aux.getCodMorgue(),""+aux.getConta1(),""+aux.getAvenida());
        }
        td.showTable();
    }
    
}
