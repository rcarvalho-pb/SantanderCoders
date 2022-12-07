import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(new Telefone("999999999", "83", "+55", TipoTelefone.RESIDENCIAL));
        telefones.add(new Telefone("888888888", "83", "+55", TipoTelefone.RESIDENCIAL));
        agenda.contatos.add(new Contato(new Pessoa("Ramon", "Carvalho"), "rcarvalho@gmail.com", "VagabundagemSA", telefones));

        agenda.contatos.forEach(x -> System.out.println(x));
    }
} 