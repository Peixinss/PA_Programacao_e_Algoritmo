import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       Scanner inUser = new Scanner(System.in);
       ArrayList<String> lista = new ArrayList<>();
       
        int opcaoLista = 0;
        int opcao = 0;

        do {
            try {
                System.out.println("""
                        Bem-vindo ao programa Lista de Tarefas

                        Escolha a opção desejada:

                        1 - Criar uma nova lista de tarefas
                        2 - Sair
                        """);

                opcaoLista = inUser.nextInt();
                inUser.nextLine();

                switch (opcaoLista) {

                    case 1 -> {
                        System.out.println("Lista criada com sucesso!");

                        do {
                            System.out.println("""
                                    Escolha a opção desejada:

                                    1 - Adicionar um item
                                    2 - Deletar a lista
                                    3 - Ver a lista
                                    4 - Alterar um item
                                    5 - Remover um item
                                    6 - Sair
                                    """);

                            opcao = inUser.nextInt();
                            inUser.nextLine();

                            switch (opcao) {

                                case 1 -> {
                                    System.out.println("Digite o nome do item:");
                                    String novaTarefa = inUser.nextLine();
                                    lista.add(novaTarefa);
                                    System.out.println("Item adicionado com sucesso!");
                                }

                                case 2 -> {
                                    lista.clear();
                                    System.out.println("Lista deletada com sucesso!");
                                }

                                case 3 -> {
                                    if (lista.isEmpty()) {
                                        System.out.println("A lista está vazia.");
                                    } else {
                                        System.out.println("Lista de tarefas:");
                                        for (int i = 0; i < lista.size(); i++) {
                                            System.out.printf("%d - %s%n", i, lista.get(i));
                                        }
                                    }
                                }

                                case 4 -> {
                                    if (lista.isEmpty()) {
                                        System.out.println("A lista está vazia.");
                                    } else {

                                        for (int i = 0; i < lista.size(); i++) {
                                            System.out.printf("%d - %s%n", i, lista.get(i));
                                        }

                                        System.out.println("Digite o número do item que deseja alterar:");
                                        int posicaoAlterar = inUser.nextInt();
                                        inUser.nextLine();

                                        if (posicaoAlterar >= 0 && posicaoAlterar < lista.size()) {
                                            System.out.println("Digite o novo item:");
                                            String novoProduto = inUser.nextLine();
                                            lista.set(posicaoAlterar, novoProduto);
                                            System.out.println("Item alterado com sucesso!");
                                        } else {
                                            System.out.println("Posição inválida.");
                                        }
                                    }
                                }

                                case 5 -> {
                                    if (lista.isEmpty()) {
                                        System.out.println("A lista está vazia.");
                                    } else {

                                        for (int i = 0; i < lista.size(); i++) {
                                            System.out.printf("%d - %s%n", i, lista.get(i));
                                        }

                                        System.out.println("Digite o número do item que deseja remover:");
                                        int posicaoRemover = inUser.nextInt();
                                        inUser.nextLine();

                                        if (posicaoRemover >= 0 && posicaoRemover < lista.size()) {
                                            lista.remove(posicaoRemover);
                                            System.out.println("Item removido com sucesso!");
                                        } else {
                                            System.out.println("Posição inválida.");
                                        }
                                    }
                                }

                                case 6 -> System.out.println("Saindo da lista...");

                                default -> System.out.println("Opção inválida.");
                            }

                        } while (opcao != 6);
                    }

                    case 2 -> System.out.println("Obrigado por usar o nosso sistema!");

                    default -> System.out.println("Opção inválida.");
                }

            } catch (Exception erro) {
                System.out.println("Erro! Entrada inválida.");
                inUser.nextLine();
            }

        } while (opcaoLista != 2);

        inUser.close();
    }
}
