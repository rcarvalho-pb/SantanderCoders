package contabilidade;

public class Balanco {
    
    public Balanco(){}

    public void balancoTrimestral(int first, int second, int third){
        System.out.println("O gasto do primeiro trimestre foi de: R$ " + (first+second+third) + ",00");
    }
}
