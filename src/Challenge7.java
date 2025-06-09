import java.util.List;

public class Challenge7 {
    public static void main(String[] args) {
        // 👨‍🍳 Desafio 7 – Avaliação final do MasterChef
        //Objetivo: Verifique se todos os pratos têm mais de 4 letras e se algum deles contém a palavra “doce”.
        List<String> pratos = List.of("Lasanha", "Hamburguer", "Doce de leite", "Pizza");

        boolean todosTemMaisDe4Letras = pratos.stream().
                allMatch(prato -> prato.length() > 4);
        boolean contemDoce = pratos.stream()
                .anyMatch(prato -> prato.toLowerCase().contains("doce"));
        System.out.println("Todos têm mais de 4 letras? " + todosTemMaisDe4Letras);
        System.out.println("Algum prato contém doce? " + contemDoce);
    }
}
