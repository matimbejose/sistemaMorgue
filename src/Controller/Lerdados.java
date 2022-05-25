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

    public   void  LerdadosCorpo(Vector list,String nameFil) {
        StringTokenizer umaCadeia;
        String umaLinha;
        try {
        FileReader fr = new FileReader(nameFil);
        BufferedReader br = new BufferedReader(fr);
        umaLinha = br.readLine();
        while(umaLinha != null) {
            umaCadeia = new  StringTokenizer(umaLinha, ";");
            int codCorpo = Integer.parseInt(umaCadeia.nextToken());
            char genero = umaCadeia.nextToken().charAt(0);
            String faixaEtaria  = umaCadeia.nextToken();
            String causaMorte = umaCadeia.nextToken();
            char criteiro = umaCadeia.nextToken().charAt(0);
            if (criteiro == 'c' || criteiro == 'C') {
                String nome = umaCadeia.nextToken();
                String nomePante = umaCadeia.nextToken();
                CorpoConh cc = new CorpoConh(codCorpo, nome, genero, faixaEtaria, causaMorte, nomePante);
                list.addElement(cc);
                list.trimToSize();
            } else {
                String marcasPele = umaCadeia.nextToken();
                CorpoDes cd = new CorpoDes(codCorpo, genero, faixaEtaria, causaMorte, marcasPele);
                list.addElement(cd);
                list.trimToSize();
            }
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

    public   void  LerdadosCorpoT(Vector list,String nameFil) {
        StringTokenizer umaCadeia;
        String umaLinha;
        try {
        FileReader fr = new FileReader(nameFil);
        BufferedReader br = new BufferedReader(fr);
        umaLinha = br.readLine();
        while(umaLinha != null) {
            umaCadeia = new  StringTokenizer(umaLinha, ";");
            int codCorpo = Integer.parseInt(umaCadeia.nextToken());
            char tipoCorpo = umaCadeia.nextToken().charAt(0);
            int  codMorgue = Integer.parseInt(umaCadeia.nextToken());
            CorpoTrans ct = new CorpoTrans(codCorpo, tipoCorpo, codMorgue);
            list.addElement(ct);
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

    public   void  LerdadosFunc(Vector list,String nameFil) {
        StringTokenizer umaCadeia;
        String umaLinha;
        try {
        FileReader fr = new FileReader(nameFil);
        BufferedReader br = new BufferedReader(fr);
        umaLinha = br.readLine();
        while(umaLinha != null) {
            umaCadeia = new  StringTokenizer(umaLinha, ";");
            int codFunc = Integer.parseInt(umaCadeia.nextToken());
            String nome = umaCadeia.nextToken();
            String funcao = umaCadeia.nextToken();
            Funcionario fun = new Funcionario(codFunc, nome, funcao);
            list.addElement(fun);
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

    public   void  LerdadosMorgue(Vector list,String nameFil) {
        StringTokenizer umaCadeia;
        String umaLinha;
        try {
        FileReader fr = new FileReader(nameFil);
        BufferedReader br = new BufferedReader(fr);
        umaLinha = br.readLine();
        while(umaLinha != null) {
            umaCadeia = new  StringTokenizer(umaLinha, ";");
            int codMorgue = Integer.parseInt(umaCadeia.nextToken());
            int conta1 = Integer.parseInt(umaCadeia.nextToken());
            String avenida = umaCadeia.nextToken();
            Morgue m = new Morgue(codMorgue, conta1, avenida);
            list.addElement(m);
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
