public class Banner implements IReclama {
    private String mesaj;

    public Banner(String mesaj) {
        this.mesaj = mesaj;
        // Simulam un proces costisitor de creare a bannerului
        System.out.println("Creare banner: " + mesaj);
    }

    @Override
    public void afiseaza() {
        System.out.println("Afisare banner: " + mesaj);
    }

    @Override
    public Banner clone() throws CloneNotSupportedException {
        return (Banner) super.clone();
    }
}