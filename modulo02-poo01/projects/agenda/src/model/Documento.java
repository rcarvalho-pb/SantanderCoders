package model;
public class Documento {
    public String numero;
    public TipoDocumento tipo;

    public Documento(String numero, TipoDocumento tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    

    public String getNumero() {
        return numero;
    }



    public void setNumero(String numero) {
        this.numero = numero;
    }



    public TipoDocumento getTipo() {
        return tipo;
    }



    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }



    @Override
    public String toString(){
        return String.format("%s: %s\n", tipo, numero);
    }
}
