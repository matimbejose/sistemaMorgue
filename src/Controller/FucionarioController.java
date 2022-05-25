package Controller;
import java.util.Vector;
import Model.Funcionario;
import View.Table;

public class FucionarioController {
private Vector  v;
private Table td;

public  FucionarioController() {
    v = new Vector();
    td = new Table();
}

    public void  recedados() {
        int codFunc = geraCod.geraCod();
        String nome = Validacoes.ValidarString("Imforme o nome do funcionario : ", 100, 3);
        String funcao = Validacoes.ValidarString("Imforme a funcao do "+nome+" : ", 30, 3);
        Funcionario fun = new Funcionario(codFunc, nome, funcao);
        v.addElement(fun);
        v.trimToSize();
    }


    
    public void lerDoFic(String nameFil) {
        Lerdados lf =  new Lerdados();
        lf.LerdadosFunc(v, nameFil);
    }

    public void   listaF() {
        td.setHeaders("codigo ","nome","funcao");
        for (int i = 0; i < v.size(); i++) {
            Funcionario aux = (Funcionario)v.elementAt(i);
            td.addRow(""+aux.getCodF(),aux.getNome(),aux.getFuncao());
        }
        td.showTable();
    }
}
