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
    

    public CorposController() {
        v = new Vector(100);
        l = new Lerdados();
        gd = new Gravardados();
        td = new Table();
    }

    public void recebeConhecido() {
        int codCorpo = geraCod.geraCod();
        char genero = Validacoes.validarChar("Imforme  o genetro : ",1,1);
        String nome = Validacoes.ValidarString("Imforme o nome completo do falecido: ", 1000, 100);
        String  faixaEtaria = Validacoes.ValidarString("Imforme a faixa etaria: ", 100, 3);
        String  causaMorte = Validacoes.ValidarString("Imforme a causa da morte: ", 100, 3);
        String nomePante = Validacoes.ValidarString("Imforeme o nome do parante : ", 20, 3);
        CorpoConh cc = new CorpoConh(codCorpo, nome, genero, faixaEtaria, causaMorte, nomePante);
        v.addElement(cc);
        v.trimToSize();
    }

    public void recebeDesconhecido() {
       int codCorpo = geraCod.geraCod();
       char  genero = Validacoes.validarChar("Imforme  o genetro : ",1,1);
       String   faixaEtaria = Validacoes.ValidarString("Imforme a faixa etaria: ", 100, 3);
         String   causaMorte = Validacoes.ValidarString("Imforme a causa da morte: ", 100, 3);
        String marcasPele = Validacoes.ValidarString(" Imforme as marcas na pele : ", 40, 3);
        CorpoDes cd  = new CorpoDes(codCorpo, genero, faixaEtaria, causaMorte, marcasPele);
        v.addElement(cd);   
        v.trimToSize();
    }
    
    public void lerDoFicC(String nameFil) {
        l.LerdadosCorpo(v, nameFil);
    }

    
    public void GravarFichC(String nameFil) {
     }

    public void   listaCConhecido() {
        td.setHeaders("Codigo", "Nome", "genero", "faixa entaria", "Nome do Parante");
        CorpoConh aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (CorpoConh)v.elementAt(i);
            td.addRow(""+aux.getCorpo(),""+aux.getGenero(),""+aux.getFaixaEtaria(),""+aux.getNomeParente());

        }
    }
    
    public void   listaCDesconhecido() {
        CorpoDes aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (CorpoDes)v.elementAt(i);
        }
    }



}

