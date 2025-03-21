
package RestaurantSingletonFactoryMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class ManagerCuptoare {
    private List<Cuptor> cuptoare;
    private PriorityQueue<Cuptor> cuptoareDisponibile;

    public ManagerCuptoare(int numarCuptoare) {
        cuptoare = new ArrayList<>();
        cuptoareDisponibile = new PriorityQueue<>((c1, c2) -> {
            int timp1 = c1.getTimpTotalGatire();
            int timp2 = c2.getTimpTotalGatire();
            return Integer.compare(timp1, timp2);
        });

        for (int i = 0; i < numarCuptoare; i++) {
            Cuptor cuptor = Cuptor.getInstance();
            cuptoare.add(cuptor);
            cuptoareDisponibile.add(cuptor);
        }
    }

    public void asigneazaPreparat(Preparat preparat) {
        Cuptor cuptor = cuptoareDisponibile.poll();
        if (cuptor != null) {
            cuptor.adaugaPreparat(preparat);
            cuptoareDisponibile.add(cuptor);
        }
    }

    public void afiseazaListeDeAsteptare() {
        for (int i = 0; i < cuptoare.size(); i++) {
            System.out.println("Lista de asteptare a cuptorului " + (i + 1) + ":");
            cuptoare.get(i).afiseazaListaDeAsteptare();
        }
    }
}