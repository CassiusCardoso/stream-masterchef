import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        // 👨‍🍳 Desafio 2 – Pedido especial do cliente
        //Objetivo: Dada uma lista de nomes de pratos,
        // filtre apenas os que têm mais de 5 letras, coloque tudo em letras maiúsculas e ordene.
        List<String> nomesPratos = List.of("Pizza", "Salmão", "Arroz", "Feijão", "Hambúrguer", "Brigadeiro", "Torta de limão");
        nomesPratos.stream()
                .filter(prato -> prato.length() > 5)
                .map(prato -> prato.toUpperCase())
                .sorted()
                .forEach(prato -> System.out.println(prato));
    }
}
