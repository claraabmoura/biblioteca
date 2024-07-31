import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca();
        boolean sair = false;
        while (!sair) {
            System.out.println("---------------Menu da biblioteca------------------");
            System.out.println("Opção 1: Adicionar livro");
            System.out.println("Opção 2: Remover livro");
            System.out.println("Opção 3: Listar livros");
            System.out.println("Opção 0: Sair do menu");

            Scanner sc = new Scanner(System.in);
            int numEscolhido = sc.nextInt();

            switch (numEscolhido) {
                case 0:
                    sair = true;
                    break;
                case 1:
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Digite o nome do livro a ser adicionado: ");
                    String nomeDoLivro = sc2.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String nomeDoAutor = sc2.nextLine();

                    Livro livroCriado = new Livro(nomeDoLivro,nomeDoAutor);
                    b1.adicionarLivro(livroCriado);
                    b1.listarLivros();
                    break;
                case 2:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Digite o nome do livro a ser removido: ");
                    String livroParaRemover =  sc3.nextLine();
                    b1.removerLivro(livroParaRemover);
                    break;
                case 3:
                    b1.listarLivros();
                    break;
                default:
                    System.out.println("Opção invalida. Escolha outro número.");
            }
        }
    }
}