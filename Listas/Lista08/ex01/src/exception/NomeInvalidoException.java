package exception;

public class NomeInvalidoException extends Exception {
    public NomeInvalidoException(){
        super("o nome do produto não deve ter menos de 3 caracteres!");

    }
}
