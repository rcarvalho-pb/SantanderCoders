package src;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            do {
                System.out.print("Informe a sua idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                voto(idade);
                System.out.print("Deseja tentar novamente(s/N)? ");
            } while (sc.nextLine().equals("s"));

        } catch (IllegalArgumentException e){
            System.err.println("Idade inválida. ");
        }
    }

    static public void voto(int idade){
        System.out.println((idade > 70 || (idade >= 16 && idade < 18)) ? "Voto facultativo. " :
                (idade >= 18) ? "Voto obrigatório. " :
                        "Sem direito a votar");
    }

}
