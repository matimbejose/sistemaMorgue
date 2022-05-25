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
}

