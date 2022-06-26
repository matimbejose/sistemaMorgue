package Model;

public class UserD extends Usuario {
    private int ano;

    public UserD(int code,String nome, String Username, int password ,int ano) {
        super(code, nome, Username, password);
        this.nome = nome;
        this.Username = Username; 
        this.password = password;
        this.ano = ano;
    }


    public UserD() {
        this(0, "", "", 0,0);
    }
    public void setano(int ano){

        this.ano = ano;
    }

    public int getano(){
       return ano; 
    }

    public void  meusDados() {
      super.meusDados();
      System.out.println("Ano :"+ano);
    }
}
