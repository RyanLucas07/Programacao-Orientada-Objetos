import java.util.*;
public class App {
    private static Scanner SCAN = new Scanner(System.in);
    private static final int ANO_ATUAL = 2024; 
    public static void main(String[] args) throws Exception {
        int anoDigitado = anoDeNascimento();
    }
    public static int anoDeNascimento(){
        System.out.println("Digite o ano do seu nascimento");
        int anoDigitado = Integer.parseInt(SCAN.nextLine());
        int resultado = ANO_ATUAL - anoDigitado;
        System.out.println("Até o final deste ano você terá a idade de " + resultado + " anos!");

        return resultado;
    }
}
