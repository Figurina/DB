package PantofiBuilderFactory;

public class TestMagazinPantofi {
    public static void main(String[] args) {
        try {
            // Pantof valid cu materiale secundare
            Pantof pantof1 = new Pantof.Builder("stiletto", 38, 10.0, "piele")
                    .adaugaMaterialSecundar("dantela")
                    .adaugaMaterialSecundar("fundita")
                    .adaugaMesajText("Iubire")
                    .build();
            System.out.println("Pantof 1: " + pantof1);

            // Pantof valid cu mesaje text
            Pantof pantof2 = new Pantof.Builder("tenisi", 40, 2.0, "canvas")
                    .adaugaMesajText("Fugii")
                    .adaugaMesajText("Repede")
                    .build();
            System.out.println("Pantof 2: " + pantof2);

            // Pantof invalid (marime incorecta)
            Pantof pantof3 = new Pantof.Builder("balerini", 50, 1.0, "satin").build();
            System.out.println("Pantof 3: " + pantof3);

        } catch (ExceptiePersonalizarePantof e) {
            System.err.println("Eroare: " + e.getMessage());
        }
    }
}