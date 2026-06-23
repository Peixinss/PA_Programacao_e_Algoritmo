import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
       ArrayList<String> listaDeContatos = new ArrayList<>();
       
       int opcaoLista = 0;
       int opcao = 0;
       String novoItem = ""; 
       
       
            do{
                try{
                    System.out.println("""
                    Bem vindos ao programa Cadastro de Contatos

                    Escolha a opção desejada:

                    1 - Entrar no programa
                    2 - Sair

                    """);
                    opcaoLista = inUser.nextInt();
                    inUser.nextLine();

                    switch(opcaoLista){
                        case 1 -> {
                            System.out.println("Cadastro de Contatos com sucesso");

                            do{
                                System.out.println("""
                                        Escolha a opção desejada:
                                        1 - Adicionar um contato
                                        2 - Buscar contatos
                                        3 - Sair
                                        """);
                                    
                                opcao = inUser.nextInt();
                                inUser.nextLine();
                                    
                                switch(opcao){
                                case 1 -> {
                                    System.out.println("Você escolheu adicionar um contato ");
                                    System.out.println("Digite o nome do contato: ");                                    

                                    novoItem = inUser.nextLine();
                                    listaDeContatos.add(novoItem);

                                }
                                case 2 ->{
                                    System.out.println("Você procurar um contato");
                                    for(String item : listaDeContatos){
                                        System.out.printf("%s \n", item);
                                    }
                                }

                                }
                           
                             }while(opcao !=3);                    


                            
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
