package View;
import Controller.*;
public class Menu {
    public static void boostrapApp() {
        String userF = "Usuario.txt";
        String corpoF = "corpo.txt";
        String corpT = "corpoT.txt";
        String funcF = "Funcionario.txt";
        String cF = "camera.txt";
        String m = "morgue.txt";
      UsuarioController uc = new UsuarioController();
      uc.lerFich(userF);
      CorposController g = new CorposController();
      g.lerDoFicC(corpoF);
      CorposTransferidoController gt = new CorposTransferidoController();
      gt.lerDoFicC(corpT);
      FucionarioController gf = new FucionarioController();
      gf.lerDoFic(funcF);
      CameraController gc = new CameraController();
      gc.lerDoFic(cF);
      MorgueController gm = new MorgueController();
      gm.lerDoFic(m);
        MostrarOp.mostrarTiposDeUser();
        short esc = Validacoes.validarShort("Escolha uma das opcoes acima: ", 3, 1);
        int cod;
        do {
            switch(esc) {
                case 1:
                System.out.println("\n============================= Dados de Acesso ===============================");
                String username = Validacoes.ValidarString("Username: ", 100, 2);
                int pass = Validacoes.ValidarInt("Senha: ", 99999999, 1000);
                if(uc.AuteticarDiretora(username, pass)) {
                    //opcao epenas para diretora geral 
                    MostrarOp.opcaoDetermindaD();
                    short escolha  = Validacoes.validarShort(">>>>>", 6, 1);
                    switch (escolha) {
                        case 1:
                       MostrarOp.opcaoAministarF();
                       short escf = Validacoes.validarShort(">>>>>", 3, 1);
                       //funcionarios
                       switch (escf) {
                        case 1:
                        //lista funcionarios 
                            gf.listaF();
                            esc = 3;
                            break;
                            case 2:
                            //cadastra funcionarios
                            gf.recedados();
                            gf.gravarTxt(funcF);
                            break;
                            case 3:
                            //remover funcionario
                            cod = Validacoes.ValidarInt("Codigo do funcionario: ", 9999, 1000);
                            gf.removFunc(cod);
                            gf.gravarTxt(funcF);
                            break;
                            }
                            break;

                            //gestor de obituarios
                            case  2:
                            MostrarOp.opcaoGestoresDeObituario();
                            short escolhagd = Validacoes.validarShort("Escolha uma das opcoes : ", 3, 1);
                             switch (escolhagd) {
                                //lista Gestor
                                case 1:
                                uc.listGestorG();
                                esc = 3;
                                    break;
                                    //cadastra Gestor
                                    case 2:
                                    uc.cadastrarGB();
                                    uc.GravarFich(userF);
                                    break;
                                    //remove gestor
                                    case 3:
                                    cod = Validacoes.ValidarInt("Codigo do Gestor a Remover >>>", 9999, 1000);
                                    uc.RemoveGesor(cod);
                                    uc.GravarFich(userF);
                                    break;
                             }
                            break;


                            case 3:
                            ///admistrar Morgues Veiculadas 
                            MostrarOp.opcaoGestoresMorguesV();
                            short escolhal = Validacoes.validarShort(">>>", 6, 1);

                            switch (escolhal) {
                                //lista 
                                case 1:
                                gm.listaM();
                                esc = 3;
                                    break;

                                    //cadastra
                                    case 2:
                                    gm.recedados();
                                    gm.gravarTxt(m);
                                    break;

                                    //remove
                                    case 3:
                                    cod = Validacoes.ValidarInt("Codigo da morgue que deseja remover >>>", 9999, 1000);
                                    gm.removeM(cod);
                                    gm.gravarTxt(m);
                                    break;

                            }
                            break;

                            case 4:
                            //meus dados
                            uc.mostraDados("diretora");
                            break;
                        
                    }
                } else {
                    System.out.println("Nao Conseguimos Encotrar Nenhum Resgisto.Tente Novamente !");
                }
                break;
                case 2:
                System.out.println("\n============================= Dados de Acesso ===============================");
                username = Validacoes.ValidarString("Username: ", 100, 2);
                pass = Validacoes.ValidarInt("Senha: ", 9999, 1000);
                if(uc.AuteticarGestor(username, pass)) {
                    //opcao epenas para diretora geral 
                    MostrarOp.opcaoFuncionarios();
                    short escolha  = Validacoes.validarShort(">>>>>", 6, 1);
                    switch (escolha) {
                        //lsitar corpos
                        case 1:
                        MostrarOp.mostarTipoCopr();
                        short corp = Validacoes.validarShort(">>>>>", 6, 1);
                        switch (corp) {
                            case 1:
                            g.listaCConhecido();
                            esc = 3;
                                break;
                                case 2:
                                g.listaCDesconhecido();
                                esc = 3;
                                break;
                                case 3:
                                gt.listaCorpoT();
                                esc = 3;
                                break;
                        }
                            break;
                            //cadastrar corpos
                            case 2:
                            MostrarOp.mostarTipoCopr();
                            corp = Validacoes.validarShort(">>>>>", 6, 1);
                            switch (corp) {
                                //conhecido
                                case 1:
                                g.recebeConhecido();
                                g.gravarTxt(corpoF);
                                    break;
                                    //dseconhecido
                                    case 2:
                                    g.recebeDesconhecido();
                                    g.gravarTxt(corpoF);
                                    break;
                            }
                            break;
                            //remover corpos
                            case 3:
                            MostrarOp.mostarTipoCopr();
                            short rm = Validacoes.validarShort(">>>", 6, 1);
                            switch (rm) {
                                case 1:
                                cod = Validacoes.ValidarInt("Codigo do corpo  a remover >>>> ", 9999, 1000);
                                g.removeCorC(cod);
                                g.gravarTxt(corpoF);
                                    break;
                                    case 2:
                                cod = Validacoes.ValidarInt("Codigo do corpo  a remover >>>>", 9999, 1000);
                                g.removeCorD(cod);
                                g.gravarTxt(corpoF);
                                    break;
                            }
                            break;
                            //Transferir corpos
                            case 4:
                            gt.recebeCTransF();
                            gt.GravarFichC(corpT);
                            break;
                            //listar morgues veiculadas
                            case 5:
                            gm.listaM();
                            esc = 3;
                            break;

                            case 6:
                            uc.mostraDados("gestor");
                            break;
                    }

                } else {
                    System.out.println("Nao Conseguimos Encotrar Nenhum Resgisto.Tente Novamente !");
                }
                break;
            }
      
        } while(esc != 3);
    }

}
