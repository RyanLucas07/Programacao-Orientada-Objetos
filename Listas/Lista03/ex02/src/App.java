import java.util.*;
public class App {
    private static final int QUANTIDADE_NOTAS =3;
    private static int[] notas = new int[QUANTIDADE_NOTAS];
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int mediaNotas = notasDosCriticos();
        imprimirMedia(mediaNotas);
    }
    public static int notasDosCriticos(){
        int somatorio = 0;
        for(int i = 0; i < QUANTIDADE_NOTAS; i++){
            System.out.println("Digite a nota dada de um critico:");
            notas[i] = Integer.parseInt(SCAN.nextLine());
            somatorio = notas[i] + somatorio;
        }
        int resultadoMedia = somatorio / QUANTIDADE_NOTAS;
        return resultadoMedia;
    }
    public static void imprimirMedia(int resultadoMedia){
        System.out.println("A media é: " + resultadoMedia);
    }
}
