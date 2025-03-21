public class TeavaSuperioara implements IComponenta {
    private String culoare;
    private double dimensiune;

    public TeavaSuperioara(String culoare, double dimensiune) {
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    @Override
    public TeavaSuperioara clone() {
        return new TeavaSuperioara(this.culoare, this.dimensiune);
    }

    @Override
    public String toString() {
        return "TeavaSuperioara [culoare=" + culoare + ", dimensiune=" + dimensiune + "]";
    }
}