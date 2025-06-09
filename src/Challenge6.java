import java.util.List;

public class Challenge6 {
    public static void main(String[] args) {
        // 👨‍🍳 Desafio 6 – Soma dos ingredientes
        //Objetivo: Some todos os números da lista usando .reduce().
        List<Integer> ingredientes = List.of(10, 20, 30);
        int soma = ingredientes.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(soma);

    }
}
