package model;
public class Telefone {
    private String numero;
    private String ddd;
    private String ddi;
    private TipoTelefone tipo;

    public Telefone(String numero, String ddd, String ddi, TipoTelefone tipo){
        this.numero = numero;
        this.ddd = ddd;
        this.ddi = ddi;
        this.tipo = tipo;
    }

    public Telefone(String numero){
        this(numero, null, null, null);
    }

    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi) {
        this.ddi = ddi;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "" + ddi + " (" + ddd + ") " + numero + "\n";
    }
}
