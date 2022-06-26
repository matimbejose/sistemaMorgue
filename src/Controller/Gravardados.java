package Controller;
import java.util.Vector;
import Model.Camera;
import Model.Corpo;
import Model.CorpoConh;
import Model.CorpoDes;
import Model.CorpoTrans;
import Model.Funcionario;
import Model.Morgue;
import Model.UserAb;
import Model.UserD;
import Model.Usuario;

import java.io.*;

public class Gravardados {


    public  void  gravaCorpo(String nameFil, Vector list) {
        Corpo c;
        CorpoConh cc;
        CorpoDes cd;

        try {
            FileWriter fw = new FileWriter(nameFil);
            BufferedWriter br = new BufferedWriter(fw);
            for(int i = 0; i < list.size(); i++) {
                c = (Corpo)list.elementAt(i);
                if(c instanceof CorpoConh) {
                    cc = (CorpoConh)c;
                    br.write(cc.getCorpo()+";"+cc.getGenero()+";"+cc.getFaixaEtaria()+";"+cc.getCausaMorte()+";"+"c"+";"+cc.getNome()+";"+cc.getNomeParente());
                    br.newLine();
                } else {
                    cd = (CorpoDes)c;
                    br.write(cd.getCorpo()+";"+cd.getGenero()+";"+cd.getFaixaEtaria()+";"+cd.getCausaMorte()+";"+"d"+";"+cd.getMarcasPele());
                    br.newLine();
                }
            }
            br.close();
        }  catch (IOException l){
            System.out.print(l.getMessage());
        }
       
    }

    
    public  void  gravaFunc(String nameFil, Vector list) {
     Funcionario f; 
        try {
            FileWriter fw = new FileWriter(nameFil);
            BufferedWriter br = new BufferedWriter(fw);
            for(int i = 0; i < list.size(); i++) {
                f =(Funcionario)list.elementAt(i);

               br.write(f.getCodF()+";"+f.getNome()+";"+f.getFuncao());
               br.newLine();
               
            }
            br.close();
        }  catch (IOException l){
            System.out.print(l.getMessage());
        }
       
    }

    public  void  gravaMorgue(String nameFil, Vector list) {
        Morgue m; 
           try {
               FileWriter fw = new FileWriter(nameFil);
               BufferedWriter br = new BufferedWriter(fw);
               for(int i = 0; i < list.size(); i++) {
                   m =(Morgue)list.elementAt(i);
                   br.write(m.getCodMorgue()+";"+m.getConta1()+";"+m.getAvenida());
                  br.newLine();
                  
               }
               br.close();
           }  catch (IOException l){
               System.out.print(l.getMessage());
           }
       }
   


    public  void  gravaCamera(String nameFil, Vector list) {
        Camera ob;
        try {
            FileWriter fw = new FileWriter(nameFil);
            BufferedWriter br = new BufferedWriter(fw);
            for(int i = 0; i < list.size(); i++) {
                ob = (Camera)list.elementAt(i);
                br.write(ob.getCodCorpo()+";"+ob.getNumero());
                br.newLine();
            }
            br.close();
        }  catch (IOException l){
            System.out.print(l.getMessage());
        }
       
    }

    public  void  gravaCorpoT(String nameFil, Vector list) {
        CorpoTrans ob;
        try {
            FileWriter fw = new FileWriter(nameFil);
            BufferedWriter br = new BufferedWriter(fw);
            for(int i = 0; i < list.size(); i++) {
                ob = (CorpoTrans)list.elementAt(i);
                br.write(ob.getCodCorpo()+";"+ob.getTipoCorpo()+";"+ob.getcodMorgue());
                br.newLine();
            }
            br.close();
        }  catch (IOException l){
            System.out.print(l.getMessage());
        }

    }


        public  void  gravaUserAb(String nameFil, Vector list) {
            Usuario u;
            UserAb ab;
            UserD d;
            try {
                FileWriter fw = new FileWriter(nameFil);
                BufferedWriter br = new BufferedWriter(fw);
                for(int i = 0; i < list.size(); i++) {
                    u = (Usuario)list.elementAt(i);
                    if(u instanceof UserAb) {
                        ab = (UserAb)u;
                        br.write(ab.getCod()+";"+ab.getNome()+";"+ab.getUsername()+";"+ab.getPassowrd()+";"+"g"+";"+ab.getNrOb());
                        br.newLine();
                    } else {
                        d = (UserD)u;
                        br.write(d.getCod()+";"+d.getNome()+";"+d.getUsername()+";"+d.getPassowrd()+";"+"d"+";"+d.getano());
                        br.newLine();
                    }
                }
                br.close();
            }  catch (IOException l){
                System.out.print(l.getMessage());
            }
     }


}
