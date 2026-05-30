import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner inUser = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = inUser.nextLine();

        System.out.printf("O nome informado é: %s ", nome);

        inUser.close();
    }
}
