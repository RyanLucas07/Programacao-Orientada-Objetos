package excenptions;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException(){
        super("Nome eh obrigatorio");
    }
}
