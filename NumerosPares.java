import java.lang.management.ManagementPermission;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumerosPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 1, 2, 3, 3, 6, 6, 6, 6, 6);
        calcular(numeros);
    }

    private static void calcular(List<Integer> numerosQueFormamParesOuNao) {
        Map<Integer, Integer> numerosFiltrados = new HashMap<>();

        numerosQueFormamParesOuNao.forEach(num -> {
            if(numerosFiltrados.containsKey(num)){
                numerosFiltrados.put(num, numerosFiltrados.get(num) + 1);
            } else {
                numerosFiltrados.put(num, 1);
            }
        });

        numerosFiltrados.forEach((key, value) -> {
            if(value % 2 == 0 || value > 2){
                System.out.println(key);
            }
        });


    }


}
