package ClubFactoryMethodSingleton;

public class FabricaJucatori {
    public static Jucator creeazaJucator(String tip, String nume) {
        switch (tip.toLowerCase()) {
            case "portar":
                return new Portar(nume);
            case "atacant":
                return new Atacant(nume);
            default:
                throw new IllegalArgumentException("Tip de jucator necunoscut: " + tip);
        }
    }
}