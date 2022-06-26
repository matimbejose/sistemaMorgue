package View;

import javax.sound.sampled.SourceDataLine;

public class MostrarOp {

    public static void mostarTipoCopr() {
        System.out.println("Escolha \n    [1]-Corpos Conhecidos \n    [2]- Corpos Desconhecidos\n");
    }

    public static void opcaoDetermindaD() {
        System.out.println("    [1]-Administrar Funcionarios \n    [2]-Administrar Getores de Obituario\n    [3]-Administrar Morgues Vieculadas\n    [4]-Mostrar Meus dados\n ");
    }

    public static void opcaoAministarF() {
        System.out.println("    [1]-Listar Funcionarios \n    [2]-Cadastrar Funcionarios\n    [3]-Remover Funcionarios\n");
    }

    public static void opcaoFuncionarios() {
        System.out.println("Escolha\n    [1]-Listar Corpos   \n    [2]-Cadastrar Corpos \n    [3]-Remover Corpos \n    [4]-Transferir Corpos  \n    [5]-Listar Morgues Vieculadas\n    [6]-Mostrar Meus dados\n");
    }

    public static void opcaoGestoresDeObituario() {
        System.out.println("\nEscolha: \n    [1]-Listar Gestor(a) \n    [2]-Cadastrar Gestor(a) \n    [3]-Remover Gestor(a)\n");
    }

    public static void opcaoGestoresMorguesV() {
        System.out.println("\nEscolha: \n    [1]-Listar Morgues(a) \n    [2]-Cadastrar Morgue(a) \n    [3]-Remover Morgue(a)\n");
    }

    public static void mostrarTiposDeUser() {
        System.out.println("===============================================================================");
        System.out.println("<<<<BEM VINDO AO SISTEMA DE GESTAO DE MORGUE DO HOSPITAL CENTRAL DE MAPUTO>>>>>");
        System.out.println("===============================================================================");
        System.out.println("\nTipo de Usuario \n1-Diretor(a) geral \n2-Gestor(a) de Obituario \nPara sair precione ===>[3]\n");
    }
}
