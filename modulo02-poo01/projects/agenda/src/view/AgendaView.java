package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.Contato;
import model.Documento;
import model.TipoDocumento;
import model.TipoTelefone;
import model.Pessoa;
import model.Telefone;

public class AgendaView {
    
    private Scanner sc = new Scanner(System.in);

    public String menu(){
    
    System.out.println(Messages.menu);
    System.out.print(Messages.input);
    String opcao = sc.nextLine();

    return opcao;
}

    public boolean end() {
        System.out.println(Messages.encerramento);
        sc.close();
        return false;
    }

    public Contato criarContato() {
        System.out.print("Nome: ");
        System.out.print(Messages.input);
        String nome = sc.nextLine();
        System.out.print("Tipo de documento: ");
        System.out.print(Messages.input);
        TipoDocumento documento = TipoDocumento.valueOf(sc.nextLine().toUpperCase());
        System.out.print("numero: ");
        System.out.print(Messages.input);
        String numero = sc.nextLine();
        System.out.print("Quantidade de numeros: ");
        System.out.print(Messages.input);
        return new Contato(new Pessoa(nome, new Documento(numero, documento)), adicionarTelefones(Integer.parseInt(sc.nextLine())));
    }

    public List<Telefone> adicionarTelefones(int quantidade){
        List<Telefone> telefones = new ArrayList<>();
        String numero, ddi, ddd;
        TipoTelefone tipo;
        for(int i = 0; i < quantidade; i++){
            System.out.print("DDI: ");
            System.out.print(Messages.input);
            ddi = sc.nextLine();
            System.out.print("DDD: ");
            System.out.print(Messages.input);
            ddd = sc.nextLine();
            System.out.print("Telefone: ");
            System.out.print(Messages.input);
            numero = sc.nextLine();
            System.out.print("Tipo: ");
            System.out.print(Messages.input);
            tipo = TipoTelefone.valueOf(sc.nextLine().toUpperCase());
            telefones.add(new Telefone(numero, ddd, ddi, tipo));
        }
        return telefones;
    }

    public List<Contato> buscarContato(List<Contato> listaContatos) {
        System.out.println("Qual o contato? ");
        System.out.print(Messages.input);
        String contato = sc.nextLine();
        List<Contato> contatos = listaContatos.stream().filter(cont -> cont.getPessoa().getNomeCompleto().toLowerCase().contains(contato.toLowerCase())).collect(Collectors.toList());
        if(contatos.size() == 0) System.err.println("Contato não encontrado. ");
        return contatos;
    }

    public Contato removerContato(List<Contato> listaContatos) {
        List<Contato> encontrados = new ArrayList<>();
        System.out.println("Contato a remover: ");
        System.out.print(Messages.input);
        encontrados = buscarContato(listaContatos);
        System.out.println(encontrados);
        if(encontrados.size() == 1){
            return encontrados.get(0);
        }
        System.out.println("Qual a remover? ");
        System.out.print(Messages.input);
        Integer opcao = sc.nextInt() - 1;
        sc.nextLine();
        return encontrados.get(opcao);
    }

    public void listarContatos(List<Contato> listaContatos) {
        listaContatos.forEach(System.out::println);
    }
}
