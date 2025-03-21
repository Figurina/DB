package ClubFactoryMethodSingleton;


public class Main {
    public static void main(String[] args) {
        // Crearea jucatorilor
        Jucator jucator1 = FabricaJucatori.creeazaJucator("portar", "Ion");
        Jucator jucator2 = FabricaJucatori.creeazaJucator("atacant", "Mihai");
        Jucator jucator3 = FabricaJucatori.creeazaJucator("atacant", "Alex");

        // Afisarea antrenamentelor initiale
        jucator1.afiseazaAntrenamente();
        jucator2.afiseazaAntrenamente();
        jucator3.afiseazaAntrenamente();

        // Actualizarea antrenamentelor
        jucator1.actualizeazaAntrenament("Tehnici avansate de portar");
        jucator2.actualizeazaAntrenament("Antrenament lovituri de penalty");

        // Afisarea antrenamentelor actualizate
        jucator1.afiseazaAntrenamente();
        jucator2.afiseazaAntrenamente();

        // Testare anti-doping
        ListaDoping listaDoping = ListaDoping.getInstanta();
        listaDoping.adaugaSubstantaInterzisa("Substanta X");
        listaDoping.afiseazaSubstanteInterzise();

        // Verificarea daca o substanta este interzisa
        System.out.println("Este Substanta X interzisa? " + listaDoping.esteSubstantaInterzisa("Substanta X"));
        System.out.println("Este Substanta Y interzisa? " + listaDoping.esteSubstantaInterzisa("Substanta Y"));
    }
}