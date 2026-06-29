package maven.example.entity;

public class Livro {
    public int ano;
    public int ano;
    public int ano;
    public int ano;
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void mostrarLivro(){
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor(a): " + this.autor);
        System.out.println("Ano de publicação: " + this.ano);
    }


}
