public class Exemplar {
    private int numero = 5;
    private Livro livro;

    public Exemplar() {
    }

    public Exemplar(int numero, Livro livro) {
        this.numero = numero;
        this.livro = livro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
