import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Livro {
    private String isbn;
    private String titulo;
    private List<Autor> autores = new ArrayList<>();

    public Livro() {
    }

    public Livro(String isbn, String titulo, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores.add(autor);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> removerAutor(Autor autor) {
        for(Autor autor1 : autores){
            if(autor1.getCpf() == autor.getCpf()) {
                this.autores.remove(autor1);
                break;
            }
        }
        return autores;
    }

    public List<Autor> adicionaAutor(Autor autor) {
        this.autores.add(autor);
        return this.autores;
    }

    public void imprimirAutores() {
        this.autores.forEach(autor -> System.out.println(autor.getNome()));
    }
}
