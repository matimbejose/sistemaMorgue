package Controller;
import java.io.*;
import java.util.Vector;
import Model.Funcionario;
import Model.Morgue;

public class FucionarioController {
private Vector  v;

public  FucionarioController() {
    v = new Vector();
}

    public void  recedados() {
        int codFunc = geraCod.geraCod();
        String nome = Validacoes.ValidarString("Imforme o nome do funcionario : ", 100, 3);
        String funcao = Validacoes.ValidarString("Imforme a funcao do "+nome+" : ", 30, 3);
        Funcionario fun = new Funcionario(codFunc, nome, funcao);
        v.addElement(fun);
        v.trimToSize();
    }

    public void graFicn(String nameF) {
        try {
            FileOutputStream ff = new FileOutputStream(nameF);
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
        for (int i = 0; i < v.size(); i++) {
            Funcionario aux = (Funcionario)v.elementAt(i);
            x = x + "\n";
        }
        return x;
    }
}
