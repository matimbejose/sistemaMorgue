package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validacoes {
    private static BufferedReader app = new BufferedReader(new InputStreamReader(System.in));

    public static String  ValidarString(String msg, int max, int min)  {
        String x = " ";

     

        do {
            System.out.print(msg);
            try {
                x = app.readLine();
            } catch (IOException l) {
                System.out.println(l.getMessage());
            } catch (NumberFormatException nn) {
                System.out.print("Nao foi possivel converter a string! ");
            } catch(StringIndexOutOfBoundsException l) {
                System.out.println(l.getMessage());
            }
            if (x.length() > max || x.length() < min)
            System.out.println("Dado invalido tente novamente !");
        } while (x.length() > max || x.length() < min);

        return x;
    }

    public static int ValidarInt(String msg, int max, int min) {
        int x =0;

        do {
            System.out.print(msg);
            try {
                x = Integer.parseInt(app.readLine());
            } catch (IOException l) {
                System.out.println(l.getMessage());
            } catch(NumberFormatException nn) {
                System.out.print("nao foi possivel converter a String ");
            } catch(StringIndexOutOfBoundsException l) {
                System.out.println(l.getMessage());
            }
            if (x > max || x < min) 
            System.out.println("Dado invalido tente novamente !");
        } while(x > max || x < min);
        return x;
    }

    public static short validarShort(String msg, int max, int min)  {
        short x =0;
        do {
            System.out.print(msg);
            try {
                x = Short.parseShort(app.readLine());
            } catch (IOException l) {
                System.out.println(l.getMessage());
            } catch (NumberFormatException n) {
                System.out.println("Nao foi possivel conveter a string ");
            } catch(StringIndexOutOfBoundsException l) {
                System.out.println(l.getMessage());
            }
            if (x > max || x < min)
            System.out.println("Dado invalido tente novamenete !");
        } while(x > max || x < min);
        return x;
    }


    public static float validarFloat(String msg, int max, int min)  {
        float x = 0;
         do {
             System.out.print(msg);
             try {
                 x = Float.parseFloat(app.readLine());
             } catch (IOException l) {
                 System.out.println(l.getMessage());
             } catch(StringIndexOutOfBoundsException l) {
                System.out.println(l.getMessage());
            }
            if (x > max || x < min)
            System.out.println("Dado invalido tente novamente !");
         } while(x > max || x < min);
         return x;

    }

    public static char  validarChar(String msg, int max, int min)  {
        char  x = 0;
            System.out.print(msg);
            try {
                x = app.readLine().charAt(0);
            } catch (IOException l) {
                System.out.println(l.getMessage());
            } catch(StringIndexOutOfBoundsException l) {
                System.out.println(l.getMessage());
            }
          
        return x;
    } 

 
    
 
}
