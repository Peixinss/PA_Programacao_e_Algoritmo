import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona elementos a lista add()
        nomes.add("Aluno");
        nomes.add("Renan");
        nomes.add("Peixinho");
        
        //Acessar o elemento get(indice)
        //System.out.println(nomes.get(2));

        //Alterar um item
        //nomes.set(0, "Lindo");
        //System.out.println(nomes);

        //Remover um item da lista
        //nomes.add("Remover este");
        //System.out.println(nomes);
        //nomes.remove(3);
        //System.out.println(nomes);

        //Tamanho da lista
        //System.out.println(nomes.size());

        //6 Apagar a lista
        //nomes.clear();
        //System.out.println(nomes);

        //verificar se existe
        System.out.println(nomes.contains("lokolol"));

    }
}
