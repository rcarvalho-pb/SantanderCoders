import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        sc.close();

        nome = "!" + nome.trim().replaceAll("[\s]+", " !");

        System.out.println("Resultado: " + nome);
    }
}
