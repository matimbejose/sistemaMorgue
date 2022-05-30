package Controller;
import Model.*;
import View.Table;

import java.util.*;

public class CorposTransferidoController 
{
    private  Vector v;
    private Table td;
    private Lerdados l;
    private Gravardados g;
    private RemoverDados rd;
    private EditarDaddos ed;

    public CorposTransferidoController() {
        v = new Vector(100);
        td = new Table();
        l = new  Lerdados();
        g = new Gravardados();
        rd = new RemoverDados();
        ed = new EditarDaddos();
    }


    public void recebeCTransF() {
        int codCorpo = Validacoes.ValidarInt("Imforme o codigo do corpo : ", 9999, 1000);
        char  tipoCorpo = Validacoes.validarChar("Imforme o tipo de corpo  [c-conhecido/d-desconhecido] :", 1, 1);
        int codMorgue = Validacoes.ValidarInt("Imforme o codigo da morgue : ", 9999, 1000);
        CorpoTrans ct = new CorpoTrans(codCorpo, tipoCorpo, codMorgue);
        if(v.add(ct)){
            System.out.println("adicionado com sucesso");
        } else {
            System.out.println("erro no cadrasto");
        }
        v.trimToSize();
    }
    
    public void lerDoFicC(String nameFil) {
        l.LerdadosCorpoT(v, nameFil);
}

    
    public void GravarFichC(String nameFil) {
        g.gravaCorpoT(nameFil, v);
     }

    public void removeT(int cod) {
      rd.removeCorpoT(v, cod);
    }

    public void  editaCT(int cod){
        ed.editaT(v, cod);
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

