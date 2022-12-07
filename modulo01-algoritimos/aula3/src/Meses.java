package exercicioenums;

public enum Meses {
    JANEIRO (10_000D), FEVEREIRO (17_000D),
    MARÇO (23_000D), ABRIL (35_000D),
    MAIO (26_000D), JUNHO (33_000D), JULHO (24_000D),
    AGOSTO(40_000D), SETEMBRO(37_000D),
    OUTUBRO(39_000D), NOVEMBRO (42_000D), DEZEMBRO(47_000D);

    private Double valor;

    Meses(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }

    static void gasto(Meses mes){
        System.out.println("O valor gasto no mês de " + Meses.toString(mes) + " foi de: R$ " + mes.getValor());
    }

    static public String toString(Meses mes){
        return  String.valueOf(mes).substring(0,1).toUpperCase()
                + String.valueOf(mes).substring(1).toLowerCase();
    }

}
