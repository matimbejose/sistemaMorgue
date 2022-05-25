package Model;


public class CorpoDes  extends Corpo  {
private String marcasPele;


    public CorpoDes(int codCorpo,char genero,String faixaEtaria,String causaMorte,String marcasPele) {
        super(codCorpo, genero, faixaEtaria, causaMorte);
        this.marcasPele = marcasPele;
    }

    public CorpoDes() {
        this(0, ' ', " ", " ", " ");
    }

    public void setMarcasPele(String marcasPele) {
        this.marcasPele = marcasPele;
    }

    public String getMarcasPele() {
        return marcasPele;
    }
}
