import java.util.ArrayList;
import java.util.List;

public class Contato {
    
    private Pessoa pessoa;
    private String email;
    private String empresa;

    private List<Telefone> telefones;

    public Contato(Pessoa pessoa, String email, String empresa, List<Telefone> telefones) {
        this.pessoa = pessoa;
        this.email = email;
        this.empresa = empresa;
        this.telefones = telefones;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("""
        %s
        %s
        %s

        Telefones:
        """, 
        pessoa, email, empresa));

        telefones.forEach(x -> sb.append(x));

        return sb.toString();
    }
}
