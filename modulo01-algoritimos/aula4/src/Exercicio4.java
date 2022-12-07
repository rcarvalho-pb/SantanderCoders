package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

            do {
                imprimirMenu();
                selecionar(sc.nextInt());
                sc.nextLine();
                System.out.print("Deseja realizar uma nova compra? (s/N) ");
                if (!desejaContinuar(sc.nextLine())) break;
            } while(true);
        } catch (InputMismatchException e){
            System.err.println("Erro: Entrada inválida. ");
        }

    }

    public static final String[][] menu = new String[][] {
            {"1 - ", "Coca-Cola - R$ 5,0"},
            {"2 - ", "Coca-Cola 0 - R$ 4,50"},
            {"3 - ", "Pepsi - R$ 4,40"},
            {"4 - ", "Guaraná Antarctica - R$ 3,50"},
            {"5 - ", "Fanta Laranja - R$ 4,23"},
            {"6 - ", "Água - R$ 2,50"}
    };

    static public void imprimirMenu(){


        for(String[] linha : menu){
            System.out.printf("%s%s\n", linha);
        }

        System.out.print("O que você deseja? ");
    }

    static public void selecionar(int opcao){
        if (opcao == 1) System.out.println(menu[opcao-1][1]);
        if (opcao == 2) System.out.println(menu[opcao-1][1]);
        if (opcao == 3) System.out.println(menu[opcao-1][1]);
        if (opcao == 4) System.out.println(menu[opcao-1][1]);
        if (opcao == 5) System.out.println(menu[opcao-1][1]);
        if (opcao == 6) System.out.println(menu[opcao-1][1]);
        if (opcao < 1 || opcao > 6) System.out.println("Valor inválido. ");
    }



    static public boolean desejaContinuar(String continuar){
        return continuar.equals("s");

    }
}
