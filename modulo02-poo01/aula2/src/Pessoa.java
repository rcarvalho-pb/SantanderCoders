public class Pessoa {
    public String nome;
    public String sobrenome;


    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString(){
        return String.format("%s %s", nome, sobrenome);
    }
}
