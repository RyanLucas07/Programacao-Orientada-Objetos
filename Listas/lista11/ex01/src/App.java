import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, Musica> musica1 = new HashMap<>();
        Map<String, Musica> musica2 = new HashMap<>();

        musica1.put("Lonely Day", new Musica("Lonely Day", "System of down", "Hypnotize"));
        
        BibliotecaMusical biblioteca = new BibliotecaMusical(musica1);

        biblioteca.adicionarMusica("Dead memories",new Musica("Dead memories", "slipknot",  "All hope is Gone"));
        biblioteca.adicionarMusica("Empty walls", new Musica("Empty walls", "Serj Tankian", "Elect the Dead"));
        biblioteca.adicionarMusica("B.Y.O.B.", new Musica("B.Y.O.B.", "System of a down", "Mezmerize"));
        biblioteca.adicionarMusica("Before Forget", new Musica("Before Forget","Slipknot", "vol 3:(the subliminal Verses)"));

        biblioteca.listarMusicas();

        biblioteca.buscarMusica("Dead memories");
        
    }
}
