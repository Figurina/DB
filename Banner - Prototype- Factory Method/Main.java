public class Main {
    public static void main(String[] args) {
        try {
            // Cream un banner original
            IReclama bannerOriginal = ReclamaFactory.createReclama("banner", "Black Friday Sale!");

            // Copiem bannerul original si il afisam in alte locatii
            IReclama banner1 = bannerOriginal.clone();
            IReclama banner2 = bannerOriginal.clone();
            IReclama banner3 = bannerOriginal.clone();
            IReclama banner4 = bannerOriginal.clone();

            banner1.afiseaza();
            banner2.afiseaza();
            banner3.afiseaza();
            banner4.afiseaza();

            // Cream alte tipuri de reclame
            IReclama sticker = ReclamaFactory.createReclama("sticker", "50% Reducere!");
            IReclama flyer = ReclamaFactory.createReclama("flyer", "Vizitati-ne!");

            sticker.afiseaza();
            flyer.afiseaza();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}