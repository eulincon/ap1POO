import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private String data;
    private List<Exemplar> exemplares = new ArrayList<>();
    private Pessoa pessoa;
    private static List<Aluguel> alugueis = new ArrayList<>();

    public Aluguel() {
        this.alugueis.add(this);
    }

    public Aluguel(String data, Professor pessoa) {
        this.data = data;
        this.pessoa = pessoa;
    }

    public Aluguel(String data, Aluno pessoa) {
        this.data = data;
        this.pessoa = pessoa;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }

    public void adicionarExemplar(Exemplar exemplar) {
        this.exemplares.add(exemplar);
    }

    public void removerExemplar(int numeroExemplar) {
        for (Exemplar ex : exemplares) {
            if(ex.getNumero() == numeroExemplar) {
                this.exemplares.remove(ex);
                return;
            }
        }
        System.out.println("Exemplar não está contido neste aluguel. número " +
                "exemplar: " + numeroExemplar);
    }

    public void imprimir(){
        System.out.println("========Aluguel==========");
        System.out.println("Data: " + this.data);
        System.out.println("Quantidade exemplares: " + this.exemplares.stream().count());
            this.exemplares
                    .forEach(exemplar -> {
                        System.out.println("Título exemplar: "+exemplar.getLivro().getTitulo()
                                        + " | Numero exemplar: " + exemplar.getNumero()
                                );
                    });
        System.out.println("Pessoa: " + this.pessoa.getNome());

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<Exemplar> getExemplares() {
        return exemplares;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplares.add(exemplar);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Professor pessoa) {
        this.pessoa = pessoa;
    }

    public void setPessoa(Aluno pessoa) {
        this.pessoa = pessoa;
    }
}
