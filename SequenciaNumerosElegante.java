import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SequenciaNumerosElegante {

    public static void main(String[] args) {

        Integer[] numeros = {4, 201, 1, 2, 6, 3, 202, 203, 204, 205, 5, 206, 207, 8, 7};
        Set<Integer> sequeucniaSet = new HashSet();
        sequeucniaSet.addAll(Arrays.asList(numeros));

        int numeroAtual = 0;
        int maiorSequencia = 0;
        for (int num : numeros){
            int contagemAtual = 1;

            if (!sequeucniaSet.contains( num -1)){
                numeroAtual = num;
                while (sequeucniaSet.contains(numeroAtual +1)){
                    contagemAtual++;
                    numeroAtual++;
//                    System.out.print(numeroAtual + "/" + contagemAtual +" - ");
                }
                maiorSequencia = contagemAtual > maiorSequencia ? contagemAtual : maiorSequencia;
            }
        }
        System.out.println(maiorSequencia);
    }


}
