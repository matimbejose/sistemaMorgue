package Controller;
import java.io.*;
import java.util.*;
import Model.*;

public class Lerdados {
    public   void LerDadosCamera(Vector list,String nameFil) {
        StringTokenizer umaCadeia;
        String umaLinha;
        try {
        FileReader fr = new FileReader(nameFil);
        BufferedReader br = new BufferedReader(fr);
        umaLinha = br.readLine();
        while(umaLinha != null) {
            umaCadeia = new  StringTokenizer(umaLinha, ";");
            int codCorpo = Integer.parseInt(umaCadeia.nextToken());
            int numero = Integer.parseInt(umaCadeia.nextToken());
            Camera ca = new Camera(codCorpo, numero);
            list.addElement(ca);
            list.trimToSize();
            umaLinha = br.readLine();
        }
        br.close();
        } catch (FileNotFoundException l) {
            System.out.println(l.getMessage());
        } catch (NumberFormatException l) {
            System.out.println(l.getMessage());
        } catch (NoSuchElementException l) {
            System.out.println(l.getMessage());
        } catch (IOException l) {
            System.out.println(l.getMessage());
        }
    }

    public   void  CorpoConh(Vector list,String nameFil) {
        StringTokenizer umaCadeia;
        String umaLinha;
        try {
        FileReader fr = new FileReader(nameFil);
        BufferedReader br = new BufferedReader(fr);
        umaLinha = br.readLine();
        while(umaLinha != null) {
            umaCadeia = new  StringTokenizer(umaLinha, ";");
            int codCorpo = Integer.parseInt(umaCadeia.nextToken());
            int numero = Integer.parseInt(umaCadeia.nextToken());
            Camera ca = new Camera(codCorpo, numero);
            list.addElement(ca);
            list.trimToSize();
            umaLinha = br.readLine();
        }
        br.close();
        } catch (FileNotFoundException l) {
            System.out.println(l.getMessage());
        } catch (NumberFormatException l) {
            System.out.println(l.getMessage());
        } catch (NoSuchElementException l) {
            System.out.println(l.getMessage());
        } catch (IOException l) {
            System.out.println(l.getMessage());
        }
    }

 
    
}
