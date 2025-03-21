
public class Sa implements IComponenta {
    private String culoare;
    private double dimensiune;

    public Sa(String culoare, double dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    @Override
    public Sa clone() {
        return new Sa(this.culoare, this.dimensiune);
    }

    @Override
    public String toString() {
        return "Sa [culoare=" + culoare + ", dimensiune=" + dimensiune + "]";
    }
}