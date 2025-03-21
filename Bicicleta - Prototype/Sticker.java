public class Sticker {
    private IComponenta componenta;
    private String culoareSticker;

    public Sticker(IComponenta componenta, String culoareSticker) {
        this.componenta = componenta;
        this.culoareSticker = culoareSticker;
    }

    public Sticker clone() {
        return new Sticker(this.componenta.clone(), this.culoareSticker);
    }

    @Override
    public String toString() {
        return "Sticker [componenta=" + componenta + ", culoareSticker=" + culoareSticker + "]";
    }
}