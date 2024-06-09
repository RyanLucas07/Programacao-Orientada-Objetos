package carta;

public final class AlterarFuturo {
    public AlterarFuturo(){
        super("Alterar o Futuro")
    }
    @Override
    public void exibirInformacoes(){
        System.out.println(String.format(
            """
            Nome: %s
            Revelada: %s

            Ação: Altera as proximas 3 cartas podendo você altera-las
            """
            nome,
            revelada    
        ));
    }
    public void realizarAcao(){
        System.out.println("Jogador 3 usou a carta AlterarFuturo e mudou as proximas 3 cartas do baralho!!!!! ")
    }
}
