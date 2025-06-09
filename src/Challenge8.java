import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge8 {
    public static void main(String[] args) {
        //🔥 Bônus MasterChef – Nível Chefão
        //Monte um prato com a seguinte lógica:
        //Desafios:
        //Remova duplicatas.
        //Ordene por tamanho.
        //Transforme tudo em letras maiúsculas.
        //Pegue os 3 primeiros ingredientes.
        //Retorne como lista.
        List<String> ingredientes = List.of("Tomate", "Cebola", "Tomate", "Alface", "Cebola", "Pão", "Alface");

        List<String> resultado = ingredientes.stream()
                .distinct()
                .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Ingredientes finais do prato: " + resultado);
    }
}
