package Controller;

import java.util.Vector;

import Model.UserAb;
import Model.UserD;
import Model.Usuario;
import View.Table;

public class UsuarioController {
    private Vector v;
    private Lerdados ld;
    private Gravardados gd;
    private RemoverDados rd;
    private Table t;
    private String usernameG;

    public UsuarioController() {
        v = new Vector();
        ld = new Lerdados();
        gd = new Gravardados();
        t = new Table();
        rd = new RemoverDados();
    }

    public void cadastrarGB() {
        System.out.println();
        System.out.println("\n<<<<<<<<<<<<<<<<<<<<<<Cadastro de Gestor de Orbituario>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int code = geraCod.geraCod();
        String nome = Validacoes.ValidarString("Nome: ", 50, 2);
        String  Username = Validacoes.ValidarString("Username: ", 20, 3);
        int password = Validacoes.ValidarInt("Senha : ",   9999, 1000);
        int nrOb = Validacoes.ValidarInt("Numero do obituario : ", 100, 1);
        UserAb ab = new UserAb(code, nome, Username, password,nrOb);
        if(v.add(ab)) {
             System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Cadastrado com Sucesso>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        } else {
            System.out.println("Erro no cadrasto");
        }
    }

    public void lerFich(String nameFil) {
        ld.LerdadosUsers(v, nameFil);
    }

    public void GravarFich(String nameFil) {
        gd.gravaUserAb(nameFil, v);
    }

    public void RemoveGesor(int cod){
        rd.removeG(v, cod);
    }

    public boolean AuteticarDiretora(String username,int  pass) {
        boolean aux  = false;
        Usuario u;
        UserD d;
        for(int i =0; i < v.size(); i++) {
            u =(Usuario)v.elementAt(i);
            if (u instanceof UserD) {
                 d = (UserD)u;
                 if(d.getUsername().equals(username) && d.getPassowrd() == pass) {
                    aux =  true;
                    usernameG = username;
                    System.out.println("Bem vindo(a) "+d.getNome()+" o que pretendes fazer?\n");
                 } else {
                    aux =  false;
                 }
            }
        }
        System.out.println(usernameG);
        return aux;
    }
    
    public boolean AuteticarGestor(String username, int pass) {
        boolean aux = false;
        Usuario u;
        UserAb g;

        for(int i =0; i < v.size(); i++) {
            u = (Usuario)v.elementAt(i);
            if(u instanceof UserAb) {
                g = (UserAb)u;
                if(g.getUsername().equals(username) && g.getPassowrd() == pass) {
                    aux =  true;
                    usernameG = username;
                    System.out.println("Bem vindo(a) "+g.getNome()+" o que pretendes fazer?\n");
                 } else {
                    aux =  false;
                 }
            }
            }
            System.out.println(usernameG);
            return aux;
        }



    public void listGestorG() {
        Usuario u;
        UserAb ab;
        t.setHeaders("Codigo","Nome","Username","Senha","Numero de obituario");
        for(int i =0; i < v.size(); i++) {
            u = (Usuario)v.elementAt(i);
            if(u instanceof UserAb) {
                ab =(UserAb)u;
                t.addRow(""+ab.getCod(),ab.getNome(),ab.getUsername(),""+ab.getPassowrd(),""+ab.getNrOb());
            }
        }
        t.showTable();
    }

    public void mostraDados(String tipoU) {
        Usuario u;
        UserAb ab;
        UserD d;

        if(tipoU.equalsIgnoreCase("diretora")) {
            for(int i =0; i < v.size(); i++) {
                u = (Usuario)v.elementAt(i);
                if(u instanceof UserD) {
                    d = (UserD)u;
                    if(d.getUsername().equalsIgnoreCase(usernameG)) {
                        d.meusDados();
                    }
                }
            }
        }else if(tipoU.equalsIgnoreCase("gestor")) {
            for(int i =0; i < v.size(); i++) {
                u = (Usuario)v.elementAt(i);
                if(u instanceof UserAb) {
                    ab = (UserAb)u;
                    if(ab.getUsername().equalsIgnoreCase(usernameG)) {
                        ab.meusDados();
                    }
                }
            }
        }
    }



}
