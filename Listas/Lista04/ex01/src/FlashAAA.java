public class FlashAAA {
    String nome;
    int velocidade;
    boolean viajaNoTempo;

    public void vibrarAtomos() {
        if (velocidade >= 4) {
            System.out.println(nome + " vibrou ao ponto de ficar intangivel!!");
        } else {
            System.out.println(nome + " tentou vibrar e não teve sucessso");
        }
        System.out.println("===============================");
    }
    public void correr(){
        System.out.println(nome + " correu em velocidade");
        System.out.println("=================");
    }
    public void mostrarAtributos(){
        System.out.println("nome: " + nome);
        System.out.println("velocidade: " + velocidade);
        System.out.println("viaja no tempo: " + viajaNoTempo);
        System.out.println("==============================");
    }
}