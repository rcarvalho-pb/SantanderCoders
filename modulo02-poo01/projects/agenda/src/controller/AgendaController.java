package controller;

import java.util.List;

import model.Contato;
import view.AgendaView;

public class AgendaController {
    
    AgendaView agendaView = new AgendaView();
    
    private List<Contato> listaContatos;

    public AgendaController(List<Contato> listaContatos){
        this.listaContatos = listaContatos;
    }

    public List<Contato> getListaContato(){
        return this.listaContatos;
    }

    public void menu(){
        boolean loop = true;
        while (loop){
            String opcao = agendaView.menu();
            switch (opcao){
                case "1" -> listarContatos();
                case "2" -> criarContato();
                case "3" -> removerContato();
                case "4" -> imprimirBuscarContato();
                case "0" -> loop = agendaView.end();
                default -> System.out.println("Opção Inválida. ");
            }
        }
    }

    private void listarContatos() {
        agendaView.listarContatos(listaContatos);
    }

    public void criarContato(){
        Contato contato = agendaView.criarContato();
        listaContatos.add(contato);        
        
    }
    
    public void removerContato(){
        Contato contato = agendaView.removerContato(listaContatos);
        
        listaContatos.remove(contato);
    }

    private void imprimirBuscarContato() {
        agendaView.buscarContato(listaContatos).forEach(System.out::println);
    }

    public void adicionarContato(Contato contato){
        listaContatos.add(contato);
    }

    public List<Contato> buscarContato(){
        List<Contato> contatos = agendaView.buscarContato(listaContatos);
        return contatos;
        
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        listaContatos.stream().forEach(contato -> {
            sb.append(contato);
        });

        return sb.toString();
    }
}