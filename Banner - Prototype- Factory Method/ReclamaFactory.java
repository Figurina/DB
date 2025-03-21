public class ReclamaFactory {
    public static IReclama createReclama(String type, String mesaj) {
        switch (type.toLowerCase()) {
            case "banner":
                return new Banner(mesaj);
            case "sticker":
                return new Sticker(mesaj);
            case "flyer":
                return new Flyer(mesaj);
            default:
                throw new IllegalArgumentException("Tip de reclama necunoscut: " + type);
        }
    }
}