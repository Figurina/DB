public class Sticker implements IReclama {
    private String mesaj;

    public Sticker(String mesaj) {
        this.mesaj = mesaj;
        // Simulam un proces costisitor de creare a stickerului
        System.out.println("Creare sticker: " + mesaj);
    }

    @Override
    public void afiseaza() {
        System.out.println("Afisare sticker: " + mesaj);
    }

    @Override
    public Sticker clone() throws CloneNotSupportedException {
        return (Sticker) super.clone();
    }
}