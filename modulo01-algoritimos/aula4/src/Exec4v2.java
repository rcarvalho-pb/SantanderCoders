package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exec4v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
            imprimirMenu();
            comprar(sc.nextInt()-1);
            System.out.println();
            System.out.print("Deseja realizar uma nova compra? (s/N) ");
            sc.nextLine();
            if(!sc.nextLine().equals("s")) break;
            } catch (InputMismatchException e){
                System.err.println("Erro: Entrada inválida. ");
            } catch (ArrayIndexOutOfBoundsException e){
                System.err.println("Valor inválido. ");
            }
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

    public static void imprimirMenu(){
        String[] apoio = menu.split("\n");
        System.out.println();
        for (String item : apoio){
            System.out.println(item);
        }
        System.out.print("Qual o seu pedido? ");
        System.out.println();
    }

    public static void comprar(int opcao){
        String[] apoio = menu.split("\n");
        System.out.println(apoio[opcao].substring(4));
    }
}
