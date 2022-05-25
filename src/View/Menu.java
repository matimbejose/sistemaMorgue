package View;
import Controller.*;

public class Menu {
 
    public static void mostrarMenu() {
      CorposController g = new CorposController();

      CorposTransferidoController gt = new CorposTransferidoController();
      gt.lerDoFicC("corpoT.txt");

      FucionarioController gf = new FucionarioController();
      gf.lerDoFic("Funcionario.txt");
      
      CameraController gc = new CameraController();
      gc.lerDoFic("camera.txt");

      MorgueController gm = new MorgueController();
      gm.lerDoFic("morgue.txt");

        MostrarOp.mostrarOpP();
        short esc = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);

        do {
            switch(esc) {
                //listar 
                case  1:
                MostrarOp.mosTrarOp();
                short esc1 = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);
                switch(esc1) {
                    //corpos 
                    case 1:
                    MostrarOp.mostarTipoCopr();
                    short esc2 = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);

                    switch(esc2) {
                        case 1:
                        //listar corpos conhecidos
                        break;

                        case 2:
                        //listar corppos  desconhecidos
                        break;
                    
                        case 3:
                        gt.listaCorpoT();
                        esc = 5;
                        break;
                    }
                    break;
                    //funcionarios 
                    case 2:
                    gf.listaF();
                    esc = 5;
                    break;

                    case 3:
                    //listar cameras 
                     gc.listaCamera();
                     esc = 5;
                    break;

                    case 4: 
                    gm.listaM();
                    esc = 5;
                    break;

                    //mostra menu principa;
                    case 5:
                    MostrarOp.mostrarOpP();
                    esc = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);
                    break;
                }
            break;
                
               //cadastrar 
                case 2:
                MostrarOp.mosTrarOp();
                short esc3 = Validacoes.validarShort("Imforme uma opcao do menu : ", 7, 1);
                switch(esc3) {
                    case 1:
                    // g.recebeDadoCorpo();
                    // g.GravarFich("corpo.txt");
                    break;

                    case 2:
                    gf.recedados();
                    // g.GravarFich("Fucionario.txt");
                    break;

                    case 3:
                    gc.recedados();
                    gc.GravarFich("camera.txt");
                    break;

                    case 4:
                    gm.recedados();
                    break;

                    //mostar menu principal
                    case 5:
                    MostrarOp.mostrarOpP();
                    esc = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);
                    break;
                }
                break;

                //editar dados
                case 3:
                MostrarOp.mosTrarOp();
                short esc4 = Validacoes.validarShort("imforme uma opcao do menu:  ", 7, 1);
                
                switch(esc4) {
                    //corpos 
                    case 1:
                    System.out.println("Menu \n 1-Conhecido \n 2-Desconhecido \n 3-Transferido");
                    short esc5 = Validacoes.validarShort("imforme o tipo de corpo : ", 7, 1);
                    switch(esc5) {
                        //conhecidos 
                        case 1:
                        break;

                        //desconhecido 
                        case 2:
                        break;

                        //transferido 
                        case 3:
                        break;
                    }
                    break;

                    //funcionarios 
                    case 2:
                    break;

                    //cameras 
                    case 3:
                    break;

                    //morgues vieculdas
                    case 4:
                    break;

                    case 5: 
                    MostrarOp.mostrarOpP(); 
                    esc = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);
                    break;
                }
              
                break;

                //remover dados 
                case 4:  
                MostrarOp.mosTrarOp();
                short esc5 = Validacoes.validarShort("imforme uma opcao do menu:  ", 7, 1);

                switch(esc5) {
                    //corpos
                    case 1:
                    MostrarOp.mostarTipoCopr();
                    short esc6 = Validacoes.validarShort("Imforme uma opcao do menu: ", 1, 7);

                    switch (esc6) {
                        //conhecidos
                        case 1:
                            
                        break;
                        
                        //desconhecido 
                        case 2:

                        break;

                        //transferidos
                        case 3:

                        break;
                        
                    }
                    break;

                    //funcionarios 
                    case 2:
                    break;

                    //camera\
                    case 3:
                    int numero = Validacoes.ValidarInt("Imforme o numero da camara que deseja remover: ", 100, 1);
                    gc.removeCamera(numero);
                    gc.GravarFich("camera.txt");
                    break;

                    //morgue 
                    case 4:
                    break;

                    case 5:
                    MostrarOp.mostrarOpP();
                    esc = Validacoes.validarShort("Imforme uma opcao do menu: ", 7, 1);
                    break;
                }
                break;
            }
        } while(esc != 5);
    }

}
