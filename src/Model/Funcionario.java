package Model;

public class Funcionario  {
    private int codFunc;
    private String nome;
    private String funcao;

public  Funcionario(int codFunc, String nome,String funcao) {
    this.codFunc = codFunc;
    this.nome = nome;
    this.funcao = funcao;
}

public int getCodF() {
    return codFunc;
}

public String getNome() {
    return nome;
}

public String getFuncao() {
    return funcao;
}

}
