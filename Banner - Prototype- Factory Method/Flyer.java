public class Flyer implements IReclama {
    private String mesaj;

    public Flyer(String mesaj) {
        this.mesaj = mesaj;
        // Simulam un proces costisitor de creare a flyerului
        System.out.println("Creare flyer: " + mesaj);
    }

    @Override
    public void afiseaza() {
        System.out.println("Afisare flyer: " + mesaj);
    }

    @Override
    public Flyer clone() throws CloneNotSupportedException {
        return (Flyer) super.clone();
    }
}