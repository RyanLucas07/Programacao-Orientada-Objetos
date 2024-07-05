import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Pessoa> pessoas = new LinkedHashSet<>();
        // ordena sua lista como vc adicionou
        // nao ira ter na lista

        // pessoas.remove(new Pessoa("123987", "Sabrina")); 

        for(int i = 1; i <= 15; i ++){
            pessoas.add(new Pessoa("123987", "Champson"));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // System.out.println(pessoas.contains(new Pessoa("123654", "null")));
    }
}
