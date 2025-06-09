import java.util.List;
import java.util.Optional;

public class Challeng4 {
    public static void main(String[] args) {
        //👨‍🍳 Desafio 4 – O prato misterioso
        //Objetivo: Encontre o primeiro número maior que 10 em uma lista e diga se foi encontrado ou não.
        List<Integer> valores = List.of(1, 5, 8, 15, 20);
        Optional<Integer> resultado = valores.stream()
                .filter(n -> n > 10)
                .findFirst();
        if(resultado.isPresent()){
            System.out.println("Primeiro número maior que 10: "  + resultado.get());
        }else {
            System.out.println("Nenhum número maior que 10 encontrado.");
        }
    }
}
