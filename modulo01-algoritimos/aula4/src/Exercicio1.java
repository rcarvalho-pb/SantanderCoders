package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {

            try {
                System.out.print("Informe a sua idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.println(voto(idade));
                System.out.print("Deseja tentar novamente(s/N)? ");
            } catch (InputMismatchException e) {
                System.err.println("Erro: idade inválida");
            }
        } while(sc.nextLine().equals("s"));

        sc.close();
    }

    public final String[][] mat = {
            {"18", "Obrigatório"},
            {"70", "Obrigatório"},
            {"25", "Obrigatório"},
            {"15", "Não pode votar"},
            {"75", "Voto opcional"},
    };

    static public String voto(int idade){
        if (idade > 70 || (idade >= 16 && idade < 18)) return "Voto facultativo";
        if (idade >= 18) return "Voto obrigatório";
        return "Não pode votar";
    }
}