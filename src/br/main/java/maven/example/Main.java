package maven.example;

import maven.example.entity.Livro;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    Livro[] livros = new Livro[100];
    int quantiaLivros = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu: ");
            System.out.println("[1]: Cadastrar livro ");
            System.out.println("[2]: Listar livros");
            System.out.println("[3]: Buscar livro");
            System.out.println("[0]: Sair");

            System.out.println("Escolha: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarLivros();
                    break;

                case 2:
                    System.out.println("Listar livros");
                    break;
                case 3:
                    System.out.println("Buscar livro");
                    break;

                case 0:
                    System.out.println("Fechando programa..");
                    return;

                default:
                    System.out.println("Digite uma opção válida!");
            }
        }
    }

    private static void cadastrarLivros(Scanner scanner, Livro livro, int quantiaLivros) {
        System.out.println("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.println("Autor: ");
        String autor = scanner.nextLine();

        System.out.println("Ano de lançamento: ");
        int ano = scanner.nextInt();

        Livro novoLivro = new Livro(titulo, autor, ano);
        quantiaLivros++;
    }

}
