import java.util.*;
public class App {
    private static final int NUMERO_DE_PERGUNTAS = 3;
    private static String[] gabarito = new String[NUMERO_DE_PERGUNTAS];
    private static String[] respostas = new String[NUMERO_DE_PERGUNTAS];
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String nomeDoUsuario = receberEFormatarNomeDoUsuario();
        comecarQuiz(nomeDoUsuario);
        fazerPrimeiraPergunta(nomeDoUsuario);
        fazerSegundaPergunta(nomeDoUsuario);
        fazerTerceiraPergunta(nomeDoUsuario);
        mostrarResultado(nomeDoUsuario);
        agradecerUsuario(nomeDoUsuario);
    }
    public static String receberEFormatarNomeDoUsuario(){
        System.out.println
        ("""
        Voce eh um verdadeiro fã de flash?
        Digite o seu nome para iniciar o Quiz:
        """);
        String nomeDoUsuario = (SCAN.nextLine());

        if(nomeDoUsuario.isBlank()){
            return"NPC";
        }
        nomeDoUsuario.trim();
        String[] nomeCompleto = nomeDoUsuario.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial.toLowerCase();

        return nomeFormatado;
    }
    
    public static void comecarQuiz(String nomeDoUsuario){
        System.out.println(String.format(
            """
            Vamos comecar %s!!
            Mas antes, preciso te explicar uma coisa:
            Se a letra das alternativas enviadas forem diferentes das disponiveis, tambem sera considerado errado.

            Pressione ENTER para comecar.
            """,
            nomeDoUsuario

        ));
        SCAN.nextLine();

    }
    
    public static void fazerPrimeiraPergunta(String nome){
        String resposta = "";
        do{
            System.out.println
            ("""
            Qual o maior vilão do Flash?

            A - Flash Reverso
            B - Capitão Frio
            C - Superman
            """);
            resposta = SCAN.nextLine();
        }while (ehUmaBoaResposta(resposta));

        gabarito[0] = "A";
        respostas[0] = resposta;
    }
    public static void fazerSegundaPergunta(String nome){
        String resposta = "";
        do{
            System.out.println
            ("""
            De onde vem os poderes do Flash?

            A - Empresas Wayne
            B - Do roteiro
            C - Força de aceleração
            """);
            resposta = SCAN.nextLine();
        }while (ehUmaBoaResposta(resposta));

        gabarito[1] = "C";
        respostas[1] = resposta;
    }
    public static void fazerTerceiraPergunta(String nome){
        String resposta = "";
        do{
            System.out.println
            ("""
            Qual o nome da mãe de Barry Allen(Flash)

            A - Sabrina Allen
            B - Nora Allen
            C - Diana Allen
            """);
            resposta = SCAN.nextLine();
        }while (ehUmaBoaResposta(resposta));

        gabarito[2] = "B";
        respostas[2] = resposta;
    }
    public static boolean ehUmaBoaResposta(String resposta){
        if(resposta.isBlank()){
            System.out.println
            ("""
            Sua resposta nao pode ser vazia!
            vamos enviar a perguna novamente.   
            """);
            return false;
        }
        return true;
    }
    public static void mostrarResultado(String nomeDoUsuario){
        System.out.println(String.format
        ("""
        %s vamos ver se você realmente é fã de Flash.
        Veja quais perguntas você acertou!       
        """,
        nomeDoUsuario    
        ));
        for(int i = 0; i < NUMERO_DE_PERGUNTAS; i++){
            System.out.println(String.format(
            "%s - %s",
            (i + 1),
            respostas[i].equals(gabarito[i]) ? "ACERTOU" : "ERROU"
            ));
        }
    }
    public static void agradecerUsuario(String nomeDoUsuario){
        System.out.println(String.format
        ("""
           Muito obrigado por participar do Quiz %s !!!!     
        """,
        nomeDoUsuario
        ));
    }
}
