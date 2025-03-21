package RestaurantSingletonFactoryMethod;
public class Preparat {
    private String nume;
    private int timpGatire;
    private int temperatura;

    public Preparat(String nume, int timpGatire, int temperatura) {
        this.nume = nume;
        this.timpGatire = timpGatire;
        this.temperatura = temperatura;
    }

    public String getNume() {
        return nume;
    }

    public int getTimpGatire() {
        return timpGatire;
    }

    public int getTemperatura() {
        return temperatura;
    }
}