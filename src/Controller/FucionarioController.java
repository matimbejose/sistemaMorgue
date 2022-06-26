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

public  FucionarioController() {
    v = new Vector();
    td = new Table();
    gd = new Gravardados();
    lf = new Lerdados();
    rd = new RemoverDados();
}

    public void  recedados() {
        System.out.println("\n===========================CADASTRO DE FUNCIONARIO============================");
        int codFunc = geraCod.geraCod();
        String nome = Validacoes.ValidarString("Nome: ", 100, 3);
        String funcao = Validacoes.ValidarString("Funcao: ", 100, 3);
        Funcionario fun = new Funcionario(codFunc, nome, funcao);
        if(v.add(fun)){
        System.out.println("\n=======================FUNCIONARIO CADASTRADO COM SUCESSO=====================");
        } else {
            System.out.println("ERRO NO CADASTRO");
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

  
    public void   listaF() {
        System.out.println("LISTA DE FUNCIONARIOS\n");
        td.setHeaders("codigo ","nome","funcao");
        for (int i = 0; i < v.size(); i++) {
            Funcionario aux = (Funcionario)v.elementAt(i);
            td.addRow(""+aux.getCodF(),aux.getNome(),aux.getFuncao());
        }
        td.showTable();
    }
}
