public class PesquisaBinaria {

    public static void main(String[] args) {
        int[] lista = {8 ,10, 11, 20, 25, 26};
        int item = 25;
        int baixo = 0;
        int alto = lista.length - 1;
        int acerto = 0;

        System.out.println("teste " + acerto);

        while (baixo <= alto){
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            if(chute == item){
                acerto = chute;
                break;
            } else if (chute > item){
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }

        System.out.println("teste" + acerto);
    }
}
