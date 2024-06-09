package carta;
public final class CartaPulo extends Carta {
    public CartaPulo(){
        super("Pulo")
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
                Nome: %s
                Revelada: %s
                
                Ação: Pula a vez do jogador!!!
            """
            ,
            super.nome,
            super.revelada
        ));
    }

    public void realizarAcao(){
        System.out.println("jogador 1 usou a carta pulo e pulou a vez de jogador 2")
    }
}
