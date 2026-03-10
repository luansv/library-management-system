package maven.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
                    System.out.println("Cadastro");
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
}