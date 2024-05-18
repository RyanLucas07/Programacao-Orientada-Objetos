public class Reverso {
    String nome;
    int velocidade;
    boolean possuiForcaDeAceleracao;

    public void manipularLinhaDoTempo(){
        System.out.println(nome + " volta no tempo e manipula a linha do tempo!");
        System.out.println("====================");
    }
    public void correrSobreAgua(){
        System.out.println(nome + " correu muito rapido sobre a agua!!!");
        System.out.println("====================");
    }
    public void mostrarAtributos(){
        System.out.println("nome: " + nome);
        System.out.println("velocidade: " + velocidade);
        System.out.println("contem força de aceleração: " + possuiForcaDeAceleracao);
        System.out.println("====================");
    }
    public void socar(){
        System.out.println(nome + " tentou dar um soco!");
        System.out.println("====================");
    }
}
