package Controller;
import Model.*;
import java.util.*;

public class CorposController {
    public   Vector v;

    public CorposController() {
        v = new Vector(100);
    }
    
    public  void recebeDadoCorpo() {
        char tipo = Validacoes.validarChar("Imforme  o tipo de corpo \n c-conhecido \n d-desconhecido \n t-transferido \n",1,1);
        switch(tipo) {
            case 'c':
            int codCorpo = geraCod.geraCod();
            char genero = Validacoes.validarChar("Imforme  o genetro : ",1,1);
            String  faixaEtaria = Validacoes.ValidarString("Imforme a faixa etaria: ", 100, 3);
            String  causaMorte = Validacoes.ValidarString("Imforme a causa da morte: ", 100, 3);
            String nomePante = Validacoes.ValidarString("Imforeme o nome do parante : ", 20, 3);
            CorpoConh cc = new CorpoConh();
            cc.setCodCorpo(codCorpo);
            cc.setGenero(genero);
            cc.setFaixaEtaira(faixaEtaria);
            cc.setCausaMorte(causaMorte);
            cc.setNomeParente(nomePante);
            v.addElement(cc);
            v.trimToSize();
            break;

            case 'd':
            codCorpo = geraCod.geraCod();
            genero = Validacoes.validarChar("Imforme  o genetro : ",1,1);
            faixaEtaria = Validacoes.ValidarString("Imforme a faixa etaria: ", 100, 3);
            causaMorte = Validacoes.ValidarString("Imforme a causa da morte: ", 100, 3);
            String marcasPele = Validacoes.ValidarString(" Imforme as marcas na pele : ", 40, 3);
            CorpoDes cd = new CorpoDes();
            cd.setCodCorpo(codCorpo);
            cd.setGenero(genero);
            cd.setFaixaEtaira(faixaEtaria);
            cd.setCausaMorte(causaMorte);
            cd.setMarcasPele(marcasPele);
            v.addElement(cd);   
            v.trimToSize();
            break;

            case 't':
            CorposTransController corpt = new CorposTransController();
            corpt.recebeDadoCorpo();
            corpt.GravarFich("corpoTrans.dat");
            break;
        }
    }

    

    public void lerDoFic(String nameFil) {
        Lerdados l = new Lerdados();
        // l.LerDados(v, nameFil);
    }

    
    public void GravarFich(String nameFil) {
        Gravardados g = new  Gravardados();
        // g.grava(nameFil, v);
     }



    //venho dar um jeito  
    public String  toString() {
        String  x = " ";
        CorpoConh aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (CorpoConh)v.elementAt(i);
            x = x + aux + "\n";
        }
        return x;
    }


    

}

