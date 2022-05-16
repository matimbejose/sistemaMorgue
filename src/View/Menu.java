package View;
import Controller.*;

public class Menu {
 
    public static void mostrarMenu() {
      CorposController g = new CorposController();
      g.lerDoFic("corpo.dat");
      FucionarioController gf = new FucionarioController();
      CameraController gc = new CameraController();
      gc.lerDoFic("camera.txt");
      MorgueController gm = new MorgueController();

        System.out.println("Menu\n 1-Listar dados \n 2-Cadastrar dados \n 3-Visualizar  dados \n 4-Sair do sitema");
        short esc = Validacoes.validarShort("Imforme uma opcao do menu: ", 5, 1);


        do {
            switch(esc) {
                //listar 
                case  1:
                System.out.println("Menu \n 1-Corpos \n 2-Funcionarios \n 3-Cameras \n 4-Morgues Vieculdas");
                short esc1 = Validacoes.validarShort("Imforme uma opcao do menu: ", 5, 1);
                switch(esc1) {
                    case 1:
                    System.out.println("Menu \n 1-Corpos Conhecidos \n 2- Corpos Desconhecidos \n 3-Corpos Transferidos ");
                    short esc2 = Validacoes.validarShort("Imforme uma opcao do menu: ", 5, 1);

                    switch(esc2) {
                        case 1:
                        //listar corpos conhecidos
                        break;

                        case 2:
                        //listar corppos  desconhecidos
                        break;
                    
                        case 3:
                        //listar corpos transferidos
                        break;
                    }
                    break;

                    case 2:
                    //listar Fucionarios 
                    break;

                    case 3:
                    //listar cameras 
                    System.out.print(gc);
                    break;

                    case 4: 
                    //listar morgures 
                    break;
                }
                exit();
            break;
    
                
               //cadastrar 
                case 2:
                System.out.println("Menu \n 1-Corpos \n 2-Funcionarios \n 3-Cameras \n 4-Morgues Vieculdas ");
                short esc3 = Validacoes.validarShort("Imforme uma opcao do menu : ", 5, 1);
                switch(esc3) {
                    case 1:
                    g.recebeDadoCorpo();
                    g.GravarFich("corpo.dat");
                    break;

                    case 2:
                    gf.recedados();
                    g.GravarFich("Fucionario.dat");
                    break;

                    case 3:
                    gc.recedados();
                    gc.GravarFich("camera.txt");
                    break;

                    case 4:
                    gm.recedados();
                    gm.GravarFich("Morgue.dat");
                    break;
                }
                break;

                
                //visualizar 
                case 3:
                break;
    
            }
        } while(esc != 4);
    }
}
