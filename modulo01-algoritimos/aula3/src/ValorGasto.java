package exercicioenums;

import java.util.Scanner;

public class ValorGasto {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o mês desejado: ");
            Meses mes = Meses.valueOf(sc.nextLine().toUpperCase());
            Meses.gasto(mes);
            } catch (IllegalArgumentException e) {
            System.err.println("Mês informado inexistente.");
        }
    }
}