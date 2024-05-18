public class App {
    public static void main(String[] args) throws Exception {
        FlashAAA velocista01 = new FlashAAA();
        Reverso velocista02 = new Reverso();
        Luta lutaDeVelocista = new Luta();

        velocista01.nome = "Barry";
        velocista01.velocidade = 6;
        velocista01.viajaNoTempo = false;

        velocista02.nome = "Eobard";
        velocista02.velocidade = 9;
        velocista02.possuiForcaDeAceleracao = true;

        velocista01.mostrarAtributos();
        velocista02.mostrarAtributos();

        lutaDeVelocista.comecarBatalha();
        lutaDeVelocista.lutaDeVelocidade();
        lutaDeVelocista.batalha();

    }
}
