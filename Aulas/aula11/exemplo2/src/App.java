import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Set<Integer> numerosSet = new HashSet<>();
        // ordena sua lista de forma que o computador achar melhor
        
        for (int i = 1; i <= 15; i++) {
            numerosSet.add(i);
        }

        List<Integer> numerosList = new ArrayList<>();

        for (int i = 5; i <= 10; i++) {
            numerosList.add(i);
        }

        //numerosSet.removeAll(numerosList);

        for (Integer numero : numerosSet){
            System.out.println(numero);
        }
    }
}
