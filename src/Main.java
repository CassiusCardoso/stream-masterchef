import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        👨‍🍳 Desafio 1 – Pré-preparo dos ingredientes
//Objetivo: Pegue uma lista de números inteiros e filtre apenas os pares,
// depois transforme cada um deles em seu dobro e colecione-os numa nova lista.
        List<Integer> inteiros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        inteiros.stream()
                .filter(i -> i % 2 == 0)
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println("Dobro dos pares: " + inteiros);
    }
}