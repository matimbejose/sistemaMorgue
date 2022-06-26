package Model;

public class UserAb extends Usuario {
    private int nrOb;

    
    public UserAb(int code,String nome, String Username, int password,int nrOb) {
        super(code, nome, Username, password);
        this.code = code;
        this.nome = nome;
        this.Username = Username;
        this.password = password;
        this.nrOb = nrOb;
    }

    public UserAb() {
        this(0, "", "", 0,0);
    }

    public int getNrOb() {
        return nrOb;
    }

    public void setNrOb(int NrOb){
         this.nrOb = NrOb;
    }

    public void  meusDados() {
        super.meusDados();
        System.out.println("Numero de Obituario :"+nrOb);
    }
    
    
}
