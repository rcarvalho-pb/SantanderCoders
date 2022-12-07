import java.sql.SQLOutput;
import java.util.Arrays;

public class TesteVotar {
    public static void main(String[] args) {
        String[][] mat = {
            {"18", "obrigatório"},
            {"70", "obrigatório"},
            {"25", "obrigatório"},
            {"15", "Não pode votar"},
            {"-1", "Não pode votar"},
            {"0", "Não pode votar"},
            {"71", "Voto opcional"},
            {"16", "Voto opcional"},
            {"17", "Voto opcional"},
        };



        teste(mat);

    }

    public static void teste(String[][] entrada){
        String[] resultado = new String[9];
        boolean falha = false;
        for (int i = 0; i < entrada.length; i++){
            if(voto(Integer.parseInt(entrada[i][0])).equals(entrada[i][1])){
                System.out.printf("TESTE %d: APROVADO%n", i + 1);
                resultado[i] = "APROVADO - Teste " + (i+1) + " - Resultado obtido: " + entrada[i][1] + " - Resultado esperado: "
                        + voto(Integer.parseInt(entrada[i][0]));
            } else {
                System.out.printf("TESTE %d: REPROVADO%n", i + 1);
                resultado[i] = "REPROVADO - Teste " + (i+1) + " - Resultado obtido: " + entrada[i][1] + " - Resultado esperado: "
                        + voto(Integer.parseInt(entrada[i][0]));
                falha = true;
            }
        }
        System.out.println();

        if (falha) {
            System.out.println("Testes reprovados: ");
            for (String x : resultado){
                if (x.contains("REPROVADO")){
                    System.out.println(x.replaceAll("REPROVADO - ", ""));
                }
            }
        }
        else System.out.println("Testes executados com sucesso. ");
    }

    static public String voto(int idade){
        if (idade > 70 || (idade >= 16 && idade < 18)) return "Voto opcional";
        if (idade >= 18) return "obrigatório";
        return "Não pode votar";
    }
}
