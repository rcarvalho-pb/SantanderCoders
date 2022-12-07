package application;

import contabilidade.Balanco;

public class Main {
    public static void main(String[] args) {

        int janeiro = 10_000;
        int fevereiro = 17_000;
        int marco = 23_000;
        
        new Balanco().balancoTrimestral(janeiro, fevereiro, marco);

    }
}
