
package RestaurantSingletonFactoryMethod;
import java.util.LinkedList;
import java.util.Queue;

public class Cuptor {
    private static Cuptor instance;
    private Queue<Preparat> listaDeAsteptare;
    private int timpTotalGatire;

    private Cuptor() {
        listaDeAsteptare = new LinkedList<>();
        timpTotalGatire = 0;
    }

    public static Cuptor getInstance() {
        if (instance == null) {
            instance = new Cuptor();
        }
        return instance;
    }

    public void adaugaPreparat(Preparat preparat) {
        listaDeAsteptare.add(preparat);
        timpTotalGatire += preparat.getTimpGatire();
    }

    public int getTimpTotalGatire() {
        return timpTotalGatire;
    }

    public void gatestePreparate() {
        while (!listaDeAsteptare.isEmpty()) {
            Preparat preparat = listaDeAsteptare.poll();
            System.out.println("Se gateste " + preparat.getNume() + " timp de " + preparat.getTimpGatire() + " minute la " + preparat.getTemperatura() + " grade.");
            // Simularea timpului de gatire
            try {
                Thread.sleep(preparat.getTimpGatire() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void afiseazaListaDeAsteptare() {
        for (Preparat preparat : listaDeAsteptare) {
            System.out.println(" - " + preparat.getNume() + " (" + preparat.getTimpGatire() + " minute la " + preparat.getTemperatura() + " grade)");
        }
    }
}