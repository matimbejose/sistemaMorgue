package Controller;
import Model.*;
import View.Table;

import java.util.*;

public class CorposTransferidoController 
{
    private  Vector v;
    private Table td;

    public CorposTransferidoController() {
        v = new Vector(100);
        td = new Table();
    }


    public void recebeCTransF() {
        int codCorpo = Validacoes.ValidarInt("Imforme o codigo do corpo : ", 9999, 1000);
        char  tipoCorpo = Validacoes.validarChar("Imforme o tipo de corpo : [c-conhecido/d-desconhecido]", 1, 1);
        int codMorgue = Validacoes.ValidarInt("Imforme o codigo da morgue : ", 9999, 1000);
        CorpoTrans ct = new CorpoTrans(codCorpo, tipoCorpo, codMorgue);
        v.addElement(ct);   
        v.trimToSize();
    }
    
    public void lerDoFicC(String nameFil) {
        Lerdados l = new Lerdados();
        l.LerdadosCorpoT(v, nameFil);
}

    
    public void GravarFichC(String nameFil) {
        Gravardados g = new  Gravardados();
     }

    public void   listaCorpoT() {
        td.setHeaders("Codigo do corpo", "Tipo de corpo","Codigo da morgue");
        CorpoTrans aux;
        for (int i = 0; i < v.size(); i++) {
            aux = (CorpoTrans)v.elementAt(i);
            td.addRow(""+aux.getCodCorpo(),""+aux.getTipoCorpo(),""+aux.getcodMorgue());
        }
        td.showTable();
    }



}

