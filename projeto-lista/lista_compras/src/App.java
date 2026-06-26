import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
       Scanner inUser = new Scanner(System.in);
       ArrayList<String> listaTarefas = new ArrayList<>();
       
       int opcaoLista = 0;
       int opcao = 0;
       String novaTarefa = "";
       
       
            do{
                try{
                    System.out.println("""
                    Bem vindos ao programa lista de tarefas


                    Escolha a opção desejada:


                    1 - Criar uma nova lista de tarefas
                    2 - Sair


                    """);
                    opcaoLista = inUser.nextInt();
                    inUser.nextLine();


                    switch(opcaoLista){
                        case 1 -> {
                            System.out.println("Lista Criada com sucesso");


                            do{
                                System.out.println("""
                                        Escolha a opção desejada:
                                        1 - Adicionar um item da lista
                                        2 - Deletar sua Lista
                                        3 - Ver a sua lista
                                        4 - Alterar um item da Lista
                                        5 - Remover 1 item
                                        6 - Sair
                                        """);
                                   
                                opcao = inUser.nextInt();
                                inUser.nextLine();
                                   
                                switch(opcao){
                                case 1 -> {
                                    System.out.println("Você escolheu criar um item da lista ");
                                    System.out.println("Digite o nome da atividade ");                                    


                                    novaTarefa = inUser.nextLine();
                                    listaTarefas.add(novaTarefa);


                                }
                                case 2 -> {
                                System.out.println("Voce escolheu deletar a lista");
                                listaTarefas.clear();
                                System.out.println(listaTarefas);
                                System.out.println("lista deletada com sucesso");
                                }
                                
                                case 3 ->{
                                    System.out.println("Você escolheu ver a lista");
                                    for(String item : listaTarefas){
                                        System.out.printf("%s \n", item);
                                    }
                                }
                                case 4 ->{
                                    System.out.println("Voce escolheu Alterar um item");
                                    System.out.println();
                                }
                                    
                                case 5 -> {
                                    System.out.println("Você escolheu remover um item:");
                                    System.out.println("Escolha qual item remover:");
                                    for(String item : listaTarefas){
                                        System.out.printf("%s \n", item, "\n");
                                    }
                                    String itvRemover = inUser.nextLine();

                                    boolean removido = listaTarefas.remove(itvRemover);

                                if (removido) {
                                    System.out.println("Item removido com sucesso!");
                                } else {
                                    System.out.println("Item não encontrado.");
                                    }
                                }


                                }
                                
                           
                             }while(opcao !=6);                    




                                                                                                                   
                        }

                        case 2 -> System.out.println("Obrigado por usar o nosso sistema");
                        default -> System.out.println("opção invalida");
                    }
           
                }catch(Exception erro){
                    System.out.println("Erro!!! Entrada invalida");
                    inUser.nextLine();
                    opcaoLista = 1;
                }
           
            }while(opcaoLista != 2);        
       
       inUser.close();
    }
}
