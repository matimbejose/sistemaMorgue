package Controller;
import java.util.Vector;
import Model.Funcionario;
import View.Table;

public class FucionarioController {
private Vector  v;
private Table td;
private Gravardados gd;
private Lerdados lf;
private RemoverDados rd;
private EditarDaddos ed;

public  FucionarioController() {
    v = new Vector();
    td = new Table();
    gd = new Gravardados();
    lf = new Lerdados();
    rd = new RemoverDados();
    ed = new EditarDaddos();
}

    public void  recedados() {
        int codFunc = geraCod.geraCod();
        String nome = Validacoes.ValidarString("Imforme o nome do funcionario : ", 100, 3);
        String funcao = Validacoes.ValidarString("Imforme a funcao do "+nome+" : ", 100, 3);
        Funcionario fun = new Funcionario(codFunc, nome, funcao);
        if(v.add(fun)){
            System.out.println("adicionado com sucesso");
        } else {
            System.out.println("erro no cadrasto");
        }
        v.trimToSize();
    }


    
    public void lerDoFic(String nameFil) {
        lf.LerdadosFunc(v, nameFil);
    }

    public void gravarTxt(String nameFil) {
       gd.gravaFunc(nameFil, v);
    }

    public void removFunc(int cod) {
        rd.removeF(v, cod);
    }

    public void editaF(int cod) {
        ed.editaF(v, cod);
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
