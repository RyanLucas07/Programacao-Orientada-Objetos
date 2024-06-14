import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        do{
            try{
                Usuario usuario = new Usuario(scanner.nextLine(),
                Integer.parseInt(scanner.nextLine())
                );
                
                System.out.println(usuario.getNome());
                System.out.println(usuario.getIdade());
                break;
            }catch(NomeInvalidoException, IdadeInvalidaException){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.print("Ocorreu um erro, tente novamente");
            }
        }while(true);
        System.out.println("FIM!!!!!");
    }
}
