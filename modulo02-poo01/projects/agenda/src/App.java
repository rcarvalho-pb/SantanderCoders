import java.util.ArrayList;
import java.util.List;

import controller.AgendaController;
import model.Contato;
import model.Documento;
import model.Pessoa;
import model.Telefone;
import model.TipoDocumento;
import model.TipoTelefone;

public class App {
    public static void main(String[] args){
        List<Contato> ListaContatos = new ArrayList<>();
        AgendaController agenda = new AgendaController(ListaContatos);
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(new Telefone("123123123", "83", "+55", TipoTelefone.CELULAR));
        // agenda.adicionarContato(agenda.createContato());
        agenda.adicionarContato(new Contato(new Pessoa("Ramon Carvalho", new Documento("12312312345", TipoDocumento.CPF)), telefones));
        telefones.clear();
        telefones.add(new Telefone("123123123", "83", "+55", TipoTelefone.CELULAR));
        agenda.adicionarContato(new Contato(new Pessoa("Ramon Putão", new Documento("12312312345", TipoDocumento.CPF)), telefones));

        agenda.menu();
    }
}
