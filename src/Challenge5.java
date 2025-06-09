import java.util.List;
import java.util.stream.Collectors;

public class Challenge5 {
    public static void main(String[] args) {
        //👨‍🍳 Desafio 5 – Buffet saudável
        //Objetivo: Pegue uma lista de pratos e:
        //Remova duplicatas
        //Ignore os 2 primeiros após ordenado por ordem alfabética
        //Transforme em minúsculas
        //Coletar em lista
        List<String> pratos = List.of("Salada", "Pizza", "Pizza", "Lasanha", "Hamburguer");

        List<String> resultado = pratos.stream()
                .distinct()
                .sorted()
                .skip(2)
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Resultado final: " + resultado);
    }
}
