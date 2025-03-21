import java.util.List;

public class AplicatieMall {
    public static void main(String[] args) {
        try {
            // Magazin 1: Podea implicită, fără decoratiuni
            Magazin magazin1 = new Magazin.Builder("Magazin de Modă", 150)
                    .numarIntrari(2)
                    .build();
            System.out.println(magazin1);
            System.out.println("Grad de incendiu: " + magazin1.calculeazaGradIncediu());
            System.out.println("----------------------------------------");

            // Magazin 2: Podea personalizată și decoratiuni
            Podea podeaPersonalizata = new Podea(1.5); // Podea moale
            List<Decoratiune> decoratiuni = List.of(
                    new Decoratiune(Material.LEMN),
                    new Decoratiune(Material.METAL)
            );
            Magazin magazin2 = new Magazin.Builder("Magazin de Electronice", 200)
                    .podeaPersonalizata(podeaPersonalizata)
                    .decoratiuni(decoratiuni)
                    .build();
            System.out.println(magazin2);
            System.out.println("Grad de incendiu: " + magazin2.calculeazaGradIncediu());
            System.out.println("----------------------------------------");

            // Magazin 3: Podea personalizată și decoratiuni din sticlă (configurație invalidă)
            try {
                List<Decoratiune> decoratiuniInvalide = List.of(
                        new Decoratiune(Material.STICLA)
                );
                Magazin magazin3 = new Magazin.Builder("Magazin de Bijuterii", 100)
                        .podeaPersonalizata(podeaPersonalizata)
                        .decoratiuni(decoratiuniInvalide)
                        .build();
                System.out.println(magazin3);
                System.out.println("Grad de incendiu: " + magazin3.calculeazaGradIncediu());
            } catch (IllegalArgumentException e) {
                System.out.println("Eroare la crearea magazinului 3: " + e.getMessage());
            }
            System.out.println("----------------------------------------");

            // Magazin 4: Podea implicită, cu decoratiuni
            List<Decoratiune> decoratiuniMagazin4 = List.of(
                    new Decoratiune(Material.LEMN),
                    new Decoratiune(Material.STICLA)
            );
            Magazin magazin4 = new Magazin.Builder("Magazin de Jucării", 120)
                    .decoratiuni(decoratiuniMagazin4)
                    .build();
            System.out.println(magazin4);
            System.out.println("Grad de incendiu: " + magazin4.calculeazaGradIncediu());

        } catch (Exception e) {
            System.out.println("Eroare neașteptată: " + e.getMessage());
        }
    }
}