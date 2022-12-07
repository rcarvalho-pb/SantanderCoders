package model;
import java.util.List;

public class Contato {
    private Pessoa pessoa;
    private List<Telefone> telefones;

    public Contato(Pessoa pessoa, List<Telefone> telefones){
        this.pessoa = pessoa;
        this.telefones = telefones;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (pessoa == null) {
            if (other.pessoa != null)
                return false;
        } else if (!pessoa.equals(other.pessoa))
            return false;
        return true;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + pessoa);
        telefones.stream().forEach(tel -> {
            sb.append(tel);
        });
        return sb.toString();
    }

}
