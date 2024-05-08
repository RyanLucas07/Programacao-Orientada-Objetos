import java.util.*;
public class App {
    private static Scanner SCAN = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Digite uma palavra para ser comparada com a proxima palavra digitada:");
        String palavra01 = SCAN.nextLine();
        System.out.println("Digite uma palavra para ser comparada com a palavra digitada anteriormente:");
        String palavra02 = SCAN.nextLine();
        compararPalavras(palavra01, palavra02);
    }
    public static void compararPalavras(String palavra01, String palavra02){
        if(palavra01.equals(palavra02)){
            System.out.println("As palavras são identicas");
        }
        else if(palavra01.equalsIgnoreCase(palavra02)){
            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");
        }
        else{
            System.out.println("As palavras sao diferentes");
        }
    }
}
