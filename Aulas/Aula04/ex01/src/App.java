public class App {
    public static void main(String[] args) throws Exception {
        Atleta atleta = new Atleta();
        atleta.altura = 1.75;
        atleta.nome = "Ryan";
        atleta.velocidade = 7;

        atleta.correr();
    }
}
