public class Telefone {
    
    private String numero;
    private String ddd;
    private String ddi;
    private TipoTelefone tipo;

    public Telefone(String numero, String ddd, String ddi, TipoTelefone tipo) {
        this.numero = numero;
        this.ddd = ddd;
        this.ddi = ddi;
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return String.format("%s (%s) %s\n%s\n", ddi, ddd, numero, tipo);
    }
}