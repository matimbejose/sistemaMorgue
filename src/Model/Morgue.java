package Model;

public class Morgue  {
    private int codMorgue;
    private int conta1;
    private String avenida;

    public Morgue(int codMorgue, int conta1, String avenida){
        this.codMorgue = codMorgue;
        this.conta1 = conta1;
        this.avenida = avenida;
    }

    public int getCodMorgue() {
        return codMorgue;
    }

    public int  getConta1() {
        return conta1;
    }

    public String getAvenida() {
        return avenida;
    }
}
