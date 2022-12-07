package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exerc3v2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                imprimirMenu(menu);
                comprar(sc.nextInt());
                System.out.print("Deseja realizar uma nova compra? (s/N) ");
                sc.nextLine();

            }while(sc.nextLine().equals("s"));

        } catch (InputMismatchException e){
            System.err.println("Erro: Entrada inválida. ");
        }

    }

    public static String menu = """
                                1 - Coca-Cola - R$ 5,00
                                2 - Coca-Cola 0 - R$ 4,50
                                3 - Pepsi - R$ 4,40
                                4 - Guaraná Antarctica - R$ 3,50
                                5 - Fanta Laranja - R$ 4,23
                                6 - Água - R$ 2,50
                                """;

    public static void imprimirMenu(String frase){
        String[] menu = frase.split("\n");
        for (String item : menu){
            System.out.println(item);
        }
        System.out.print("Qual o seu pedido? ");
    }

    public static void comprar(int opcao) {
        String[] apoio = menu.split("\n");

        switch (opcao--) {
            case 1 -> System.out.println(apoio[opcao].substring(4));
            case 2 -> System.out.println(apoio[opcao].substring(4));
            case 3 -> System.out.println(apoio[opcao].substring(4));
            case 4 -> System.out.println(apoio[opcao].substring(4));
            case 5 -> System.out.println(apoio[opcao].substring(4));
            case 6 -> System.out.println(apoio[opcao].substring(4));
            default -> System.out.println("Opção inválida. ");
        }
    }
}
