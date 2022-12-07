package view;

public class Messages {
    private Messages(){}

    public static String menu = """
        +----------------------------------------------+
        |   *****             MENU             *****   |
        +----------------------------------------------+
        |   [1] LISTAR CONTATOS                        |
        |   [2] CRIAR CONTATO                          |
        |   [3] REMOVER CONTATO                        |
        |   [4] BUSCAR CONTATO                         |
        |   [0] SAIR DO PROGRAMA                       |
        +----------------------------------------------+
        """;
    
    public static String input = "> ";

    public static String encerramento = "Encerrando o programa. ";

    public static String pessoa = """
        +----------------------------------------------+
        |   %-20s|
        |   %-20s|
        +----------------------------------------------+
            """;;

    public static String documento = """
            
            """;;
}
