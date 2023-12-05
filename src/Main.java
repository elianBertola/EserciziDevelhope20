import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        listaNumeri();
    }
    public static void listaNumeri() {
        Set<Integer> numeri = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));

        Integer nuovoNumero = 5;

        System.out.println(numeri);

        Iterator<Integer> iterator = numeri.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(nuovoNumero)) {
                iterator.remove();
            }
        }
        System.out.println(numeri);
        numeri.clear();
        System.out.println(numeri);
    }
}