public class Furca implements IComponenta {
    private String culoare;
    private double dimensiune;

    public Furca(String culoare, double dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    @Override
    public Furca clone() {
        return new Furca(this.culoare, this.dimensiune);
    }

    @Override
    public String toString() {
        return "Furca [culoare=" + culoare + ", dimensiune=" + dimensiune + "]";
    }
}
