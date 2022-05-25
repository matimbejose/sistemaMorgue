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
    
    public String getNome() {
        return nome;
    }

    public String getNomeParente() {
        return nomePante;
    }

    public void  setNome(String nome) {
        this.nome = nome;
    }

    public void setNomeParente(String nomePante) {
        this.nomePante = nomePante;
    }

}


