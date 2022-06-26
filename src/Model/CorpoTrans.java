package Model;


public class CorpoTrans  {
    private int codCorpo;
    private char  tipoCorpo;
    private int codMorgue;

public CorpoTrans(int codCorpo,char  tipoCorpo, int codMorgue) {
    this.codCorpo = codCorpo;
    this.tipoCorpo = tipoCorpo;
    this.codMorgue = codMorgue;
    }

    public int getCodCorpo() {
        return codCorpo;
    }
    
    public char getTipoCorpo() {
        return tipoCorpo;
    }

    public int getcodMorgue() {
        return codMorgue;
    }

    public void setTipoCorpo(char tipoCorpo) {
        this.tipoCorpo = tipoCorpo;
    }

    public void setCodMorgue(int codMorgue) {
        this.codMorgue = codMorgue;
    }
}

