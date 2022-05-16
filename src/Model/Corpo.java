package Model;

public class Corpo  {
    protected int codCorpo;
    protected char genero;
    protected String faixaEtaria;
    protected String causaMorte;

    public Corpo(int codCorpo,char genero,String faixaEtaria,String causaMorte) {
        this.codCorpo = codCorpo;
        this.genero = genero;
        this.faixaEtaria = faixaEtaria;
        this.causaMorte = causaMorte;
    }

    public Corpo() {
        this(0, ' ', "", " ");
    }

    public void setCodCorpo(int  codCorpo) {
        this.codCorpo = codCorpo;
    }

    public void setGenero(char genero) {
        if(genero == 'f' || genero =='F'|| genero =='M'||genero == 'm' )
        this.genero = genero;
    }

    public void setFaixaEtaira(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setCausaMorte(String causaMorte) {
        this.causaMorte = causaMorte;
    }



}
