package Model;

public class CorpoConh extends Corpo {
    private String nome;
    private String nomePante;

public CorpoConh(int codCorpo,String nome, char genero,String faixaEtaria,String causaMorte,String nomePante) {
        super(codCorpo, genero, faixaEtaria, causaMorte);
        this.nomePante = nomePante;
        this.nome = nome;
    }

    public CorpoConh() {
       this(0, " ", ' ', " ", " ", " ");
    }


    public void  setNomeParente(String nomePante) {
        this.nomePante = nomePante;
    }

    public String toString(){
        return "Codico do corpo : "+codCorpo+" | genero:"+genero+"|faixa etaria : "+faixaEtaria+" | causa da morte "+causaMorte+"| Nome do parente : "+nomePante+" ";
    }
}
