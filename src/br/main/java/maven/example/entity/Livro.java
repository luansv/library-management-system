package maven.example.entity;

public class Livro {
    public int ano;
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void mostrarLivro(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor(a): " + this.autor);
        System.out.println("Ano de publicação: " + this.ano);
        System.out.println("Ano de publicação: " );
        System.out.println("Ano de publicação:cxcxc " );
    }


}
