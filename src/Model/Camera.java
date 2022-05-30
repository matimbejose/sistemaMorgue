package Model;

public class Camera {
    private int  codCorpo;
    private int numero;

    public Camera(int codCorpo, int numero) {
        this.codCorpo = codCorpo;
        this.numero = numero;
    }

    public int getCodCorpo() {
        return codCorpo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
