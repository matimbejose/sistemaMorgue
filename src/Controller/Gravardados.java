package Controller;
import java.util.Vector;
import Model.Camera;

import java.io.*;

public class Gravardados {
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
}
