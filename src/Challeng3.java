import java.util.List;

public class Challeng3 {
    public static void main(String[] args){
        //👨‍🍳 Desafio 3 – Contagem de pedidos duplicados
        //Objetivo: Conte quantas vezes o prato “Pizza” aparece no pedido.
        List<String> pedidos = List.of("Pizza", "Pizza", "Sushi", "Pizza", "Hamburguer");
        pedidos.stream()
                .filter(pedido -> pedido.equalsIgnoreCase("Pizza"))
                .count();
        System.out.println("Quantidade de vezes que 'Pizza' aparece: " + pedidos);
    }
}
