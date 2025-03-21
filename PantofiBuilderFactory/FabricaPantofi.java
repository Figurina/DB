package PantofiBuilderFactory;

public class FabricaPantofi {
    public static Pantof creeazaPantof(String tip, int marime, double dimensiuneToc, String materialBaza) throws ExceptiePersonalizarePantof {
        return new Pantof.Builder(tip, marime, dimensiuneToc, materialBaza).build();
    }
}