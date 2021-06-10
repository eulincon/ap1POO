import java.util.Date;

public class main {
    public static void main(String[] args) {
        //Cria Autor 1
        Autor fernandoPessoa = new Autor("Fernando Pessoa", "12345678910");
        fernandoPessoa.adicionarArea(new Area("Romantismo"));
        fernandoPessoa.adicionarArea(new Area("Realismo"));
        //Cria Autor 2
        Autor marinaColassanti = new Autor("Marina Colassanti", "00005678910");
        marinaColassanti.adicionarArea(new Area("Barroco"));
        marinaColassanti.adicionarArea(new Area("Surrealismo"));
        //Cria Professor 1
        Professor IsacNewton = new Professor("Newton", "094359790456",
                "Doutorado");
        //Cria Professor 2
        Professor albertEintein = new Professor("Eistein", "3453454565",
                "Pos-Doutorado");
        //Cria Aluno 1
        Aluno joao = new Aluno("Joao", "098097986786", "123");
        //Cria Aluno 2
        Aluno Maria = new Aluno("Maria", "32534534534", "456");

        //Cria Livro 1
        Livro saberViver = new Livro();
        saberViver.setIsbn("12345");
        saberViver.setTitulo("Saber Viver");
        saberViver.adicionaAutor(marinaColassanti);
        //Cria Livro 2
        Livro tabacaria = new Livro();
        tabacaria.setIsbn("67890");
        tabacaria.setTitulo("Tabacaria");
        saberViver.adicionaAutor(fernandoPessoa);

        //Cria Exemplares
        Exemplar exemplar1 = new Exemplar(1, saberViver);
        Exemplar exemplar2 = new Exemplar(2, saberViver);
        Exemplar exemplar3 = new Exemplar(3, saberViver);
        Exemplar exemplar4 = new Exemplar(4, saberViver);
        Exemplar exemplar5 = new Exemplar(11, tabacaria);
        Exemplar exemplar6 = new Exemplar(22, tabacaria);
        Exemplar exemplar7 = new Exemplar(33, tabacaria);
        Exemplar exemplar8 = new Exemplar(44, tabacaria);

        // Aluga
        Aluguel aluguelJoao = new Aluguel(new Date().toString(), joao);
        aluguelJoao.adicionarExemplar(exemplar1);
        aluguelJoao.adicionarExemplar(exemplar5);
        aluguelJoao.adicionarExemplar(exemplar8);
        aluguelJoao.removerExemplar(44);
        aluguelJoao.imprimir();

    }


}
