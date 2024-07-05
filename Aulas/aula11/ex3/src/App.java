import java.security.KeyStore.Entry;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println();
       Map<String, Pessoa> map = new HashMap<>();

        Pessoa pessoa1 = new Pessoa("123654", "Joao");
        Pessoa pessoa2 = new Pessoa("654123", "Vitor");
        Pessoa pessoa3 = new Pessoa("789654", "Cleber");
        Pessoa pessoa4 = new Pessoa("456789", "Lucas");

       map.put(pessoa1.getCpf(), pessoa1);
       map.put(pessoa2.getCpf(), pessoa2);
       map.put(pessoa3.getCpf(), pessoa3);
       map.put(pessoa4.getCpf(), pessoa4);

        Set<String> chaves = map.keySet();

        for (String chave : chaves) {
         System.out.println(chave);
        }

       
        for (Pessoa pessoa : map.values()) {
         System.out.println(pessoa);
        }

    // for(Entry<String, Pessoa> entrada : map.entrySet()){
    //     System.out.println("chave: " + entrada.getKey());
    //     System.out.println("valor: " + entrada.getValue());
    // }
    }
}
