package Controller;
import java.io.*;
import java.util.*;
import Model.Morgue;

public class MorgueController {
    private Vector v;
 
    public MorgueController(){
        v = new Vector();
    }

    public  void recedados(){
      int codMorgue = geraCod.geraCod();
      int conta1 = Validacoes.ValidarInt("Imforme o contato da morgue : ", 999999999, 20000);
      String avenida = Validacoes.ValidarString("Imforme a avenida na qual a morgue esta localizada : ", 100, 2);
      Morgue mg = new Morgue(codMorgue, conta1, avenida);
      v.addElement(mg);
      v.trimToSize();
    }

    public void GravarFich(String nameFil) {
        try {
            FileOutputStream ff = new FileOutputStream(nameFil);
            ObjectOutputStream ii = new ObjectOutputStream(ff);
            ii.writeObject(v);
            ii.close();
        } catch (IOException l) {
            System.out.print(l.getMessage());
        }
    }

    
    public void lerDoFic(String nameFil) {
        Lerdados lf =  new Lerdados();
        // lf.LerDados(v, nameFil);
    }

    public String  toString() {
        String  x = " ";
        Morgue aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (Morgue)v.elementAt(i);
            x = x + "\n";
        }
        return x;
    }
    
}
