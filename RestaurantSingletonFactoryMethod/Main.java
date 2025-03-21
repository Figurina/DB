package RestaurantSingletonFactoryMethod;

public class Main {
    public static void main(String[] args) {
        // Testarea cu un singur cuptor
        System.out.println("Testarea cu un singur cuptor:");
        Cuptor cuptor = Cuptor.getInstance();

        // Crearea a 4 preparate
        Preparat preparat1 = new Preparat("Pizza", 10, 200);
        Preparat preparat2 = new Preparat("Lasagna", 15, 180);
        Preparat preparat3 = new Preparat("Pui", 20, 220);
        Preparat preparat4 = new Preparat("Peste", 12, 190);

        // Adaugarea preparatelor in lista de asteptare
        cuptor.adaugaPreparat(preparat1);
        cuptor.adaugaPreparat(preparat2);
        cuptor.adaugaPreparat(preparat3);
        cuptor.adaugaPreparat(preparat4);

        // Gatirea tuturor preparatelor
        cuptor.gatestePreparate();

        // Testarea cu 4 cuptoare
        System.out.println("\nTestarea cu 4 cuptoare:");
        ManagerCuptoare managerCuptoare = new ManagerCuptoare(4);

        // Crearea a 5 preparate
        Preparat preparat5 = new Preparat("Friptura", 18, 210);
        Preparat preparat6 = new Preparat("Sarmale", 25, 190);
        Preparat preparat7 = new Preparat("Ciorba", 15, 180);
        Preparat preparat8 = new Preparat("Salata", 5, 150);
        Preparat preparat9 = new Preparat("Prajituri", 30, 160);

        // Asignarea preparatelor la cuptoare
        managerCuptoare.asigneazaPreparat(preparat1);
        managerCuptoare.asigneazaPreparat(preparat2);
        managerCuptoare.asigneazaPreparat(preparat3);
        managerCuptoare.asigneazaPreparat(preparat4);
        managerCuptoare.asigneazaPreparat(preparat5);
        managerCuptoare.asigneazaPreparat(preparat6);
        managerCuptoare.asigneazaPreparat(preparat7);
        managerCuptoare.asigneazaPreparat(preparat8);
        managerCuptoare.asigneazaPreparat(preparat9);

        // Afisarea listelor de asteptare pentru fiecare cuptor
        managerCuptoare.afiseazaListeDeAsteptare();
    }
}