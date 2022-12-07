package model;

import view.Messages;

public class Pessoa {
    private String nomeCompleto;
    private Documento documento;


    public Pessoa(String nomeCompleto, Documento documento){
        this.nomeCompleto = nomeCompleto;
        this.documento = documento;
    }

    

    public String getNomeCompleto() {
        return nomeCompleto;
    }



    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }



    public Documento getDocumento() {
        return documento;
    }



    public void setDocumento(Documento documento) {
        this.documento = documento;
    }



    @Override
    public String toString(){
        return String.format(Messages.pessoa, nomeCompleto, documento);
    
    }
}
