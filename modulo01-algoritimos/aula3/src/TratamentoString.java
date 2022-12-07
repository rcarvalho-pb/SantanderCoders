import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class TratamentoString {
    
    static public List<Meses> separador(String frase) throws NumberFormatException, IllegalArgumentException, InputMismatchException {
        List<Meses> meses = new ArrayList<>();
        frase = frase.trim().replace(" ", "");
        String[] apoio = frase.split(",");
        
        for(int i = 0; i < apoio.length; i++){
            String[] mesValor = apoio[i].split(":");
            if(mesValor.length % 2 != 0){
                throw new InputMismatchException("Formato de entrada inválida. Valores em falta.");
            }
            meses.add(Meses.valueOf(mesValor[0].toUpperCase()));
            meses.get(i).setValor(Integer.parseInt(mesValor[1]));
        }        

        return meses;
    }

    static public void imprimirMeses(List<Meses> meses){
        for(Meses mes : meses){
            System.out.println(Meses.getName(mes) + ": " + mes.getValor());
        }
    }

    static public Integer total(List<Meses> meses){
        Integer total = 0;
        for(Meses mes : meses){
            total += mes.getValor();
        }
        return total;
    }
    
    static public void imprimirTotal(List<Meses> meses){
        
        System.out.println("Total: " + total(meses));
    }

    static public String formatarMes(Meses mes){
        return String.valueOf(mes).substring(0,1).toUpperCase()
                + String.valueOf(mes).substring(1).toLowerCase();
    }
}
