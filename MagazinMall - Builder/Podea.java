public class Podea {
    private final double duritate;

    public Podea(double duritate) {
        this.duritate = duritate;
    }

    public double getDuritate() {
        return duritate;
    }

    @Override
    public String toString() {
        return "Podea{" +
                "duritate=" + duritate +
                '}';
    }
}