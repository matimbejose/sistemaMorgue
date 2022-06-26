package Model;

public class Usuario {
    protected int code;
    protected  String nome;
    protected  String Username;
    protected int password;


    public Usuario(int code,String nome, String Username, int password) {
        this.code = code;
        this.nome = nome;
        this.Username = Username;
        this.password = password;
    }

    public int getCod() {
        return code;
    }

    public String getNome() {
        return nome;
    }

    public String getUsername() {
        return Username;
    }

    public int getPassowrd() {
        return password;
    }

    public void  meusDados() {
        System.out.println("<<<<<<<<<<<Meus Dados>>>>>>>>>>>");
        System.out.println("Codigo: "+code);
        System.out.println("Nome: "+nome);
        System.out.println("Username: "+Username);
        System.out.println("Senha: "+password);
    }
}  