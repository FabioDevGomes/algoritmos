import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenciaNumeros {

    public static void main(String[] args) {

        int[] numeros = {4, 201, 1, 2, 6, 3, 202, 203, 204, 205, 5, 206, 207};
        Set<Integer> sequeucniaEncontrada = new HashSet();

        for (int num : numeros){
            for (int i = 0; i < numeros.length; i++){
                if(numeros[i] == num + 1){
                    sequeucniaEncontrada.add(num); // 1 , 2, 5
                    sequeucniaEncontrada.add(numeros[i]); //2 , 3, 6
                }
            }
        }

        AtomicInteger count = new AtomicInteger(1);
        AtomicInteger count3 = new AtomicInteger(1);
        HashMap<Integer, Integer> map = new HashMap<>();

        sequeucniaEncontrada.forEach(num -> {
            if (sequeucniaEncontrada.contains(num + 1)){
                count.incrementAndGet();
                map.put(count3.get(), count.get());
            } else {
                count3.incrementAndGet();
                count.set(1);
            }
        });

        System.out.println(map);
    }


}
