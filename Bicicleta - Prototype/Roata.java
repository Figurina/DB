public class Roata implements IComponenta {
    private String culoare;
    private double diametru;

    public Roata(String culoare, double diametru) {
        this.culoare = culoare;
        this.diametru = diametru;
    }

    @Override
    public Roata clone() {
        return new Roata(this.culoare, this.diametru);
    }

    @Override
    public String toString() {
        return "Roata [culoare=" + culoare + ", diametru=" + diametru + "]";
    }
}