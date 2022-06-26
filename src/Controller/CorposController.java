package Controller;
import Model.*;
import View.Table;

import java.util.*;

public class CorposController 
{
    private  Vector v;
    private Lerdados l;
    private Gravardados gd;
    private Table td;
    private RemoverDados rd;

    public CorposController() {
        v = new Vector();
        l = new Lerdados();
        gd = new Gravardados();
        td = new Table();
        rd = new RemoverDados();
    }

    public void recebeConhecido() {
        int codCorpo = geraCod.geraCod();
        char genero = Validacoes.validarChar("Informe  o genero : ",1,1);
        String nome = Validacoes.ValidarString("Informe o nome completo do falecido: ", 1000, 4);
        String  faixaEtaria = Validacoes.ValidarString("Informe a faixa etaria: ", 100, 3);
        String  causaMorte = Validacoes.ValidarString("Informe a causa da morte: ", 100, 3);
        String nomePante = Validacoes.ValidarString("Informe o nome do parente : ", 20, 3);
        CorpoConh cc = new CorpoConh(codCorpo, nome, genero, faixaEtaria, causaMorte, nomePante);
        if(v.add(cc)){
            System.out.println("adicionado com sucesso");
        } else {
            System.out.println("erro no cadastro");
        }
        v.trimToSize();
    }

    public void recebeDesconhecido() {
       int codCorpo = geraCod.geraCod();
       char  genero = Validacoes.validarChar("Informe  o genero : ",1,1);
       String   faixaEtaria = Validacoes.ValidarString("Informe a faixa etaria: ", 100, 3);
         String   causaMorte = Validacoes.ValidarString("Informe a causa da morte: ", 100, 3);
        String marcasPele = Validacoes.ValidarString(" Informe as marcas na pele : ", 40, 3);
        CorpoDes cd  = new CorpoDes(codCorpo, genero, faixaEtaria, causaMorte, marcasPele);
        if(v.add(cd)){
            System.out.println("adicionado com sucesso");
        } else {
            System.out.println("erro no cadrasto");
        }
        v.trimToSize();
    }
    
    public void lerDoFicC(String nameFil) {
        l.LerdadosCorpo(v, nameFil);
    }

    public void gravarTxt(String nameFil) {
        gd.gravaCorpo(nameFil, v);
    }

    public void removeCorC(int cd) {
        rd.removeCorpo(v, cd);
    }    
    public void removeCorD(int cd) {
        rd.removeCorpoD(v, cd);
    }

  
    
  
    public void   listaCConhecido() {
        td.setHeaders("Codigo","Genero", "Faixa Etaria","Causa da Morte","Nome ", "Nome do parante");
        CorpoConh aux;
        Corpo c;

        for (int i = 0; i < v.size(); i++) {
            c = (Corpo)v.elementAt(i);
            if(c instanceof CorpoConh) {
                aux = (CorpoConh)c;
                td.addRow(""+aux.getCorpo(),""+aux.getGenero(),""+aux.getFaixaEtaria(),""+aux.getCausaMorte(),aux.getNome(),aux.getNomeParente());
            }
        }
        td.showTable();
    }
    
    public void   listaCDesconhecido() {
        td.setHeaders("Codigo","Genero", "Faixa Etaria","Causa da Morte","Marcas na pele");
        CorpoDes aux;
        Corpo c;

        for (int i = 0; i < v.size(); i++) {
            c = (Corpo)v.elementAt(i);
            if(c instanceof CorpoDes) {
                aux = (CorpoDes)c;
                td.addRow(""+aux.getCorpo(),""+aux.getGenero(),""+aux.getFaixaEtaria(),""+aux.getCausaMorte(),aux.getMarcasPele());
            }
        }

        td.showTable();
    }



}

