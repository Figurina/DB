

import java.util.List;

public final class Magazin {
    private final String nume;
    private final double suprafata;
    private final int numarIntrari;
    private final Podea podeaPersonalizata;
    private final List<Decoratiune> decoratiuni;

    private Magazin(Builder builder) {
        this.nume = builder.nume;
        this.suprafata = builder.suprafata;
        this.numarIntrari = builder.numarIntrari;
        this.podeaPersonalizata = builder.podeaPersonalizata;
        this.decoratiuni = builder.decoratiuni;
        valideaza();
    }

    private void valideaza() {
        if (numarIntrari < Math.ceil(suprafata / 100)) {
            throw new IllegalArgumentException("Numărul de intrări trebuie să fie de cel puțin 1 la fiecare 100 de metri pătrați.");
        }

        if (podeaPersonalizata != null && podeaPersonalizata.getDuritate() < 2) {
            for (Decoratiune decoratiune : decoratiuni) {
                if (decoratiune.getMaterial() == Material.STICLA) {
                    throw new IllegalArgumentException("Decoratiunile din sticlă nu sunt permise pe podele moi.");
                }
            }
        }
    }

    public String getNume() {
        return nume;
    }

    public double getSuprafata() {
        return suprafata;
    }

    public int getNumarIntrari() {
        return numarIntrari;
    }

    public Podea getPodeaPersonalizata() {
        return podeaPersonalizata;
    }

    public List<Decoratiune> getDecoratiuni() {
        return decoratiuni;
    }

    public double calculeazaGradIncediu() {
        double gradIncediuBaza = suprafata / 100;
        if (podeaPersonalizata != null) {
            gradIncediuBaza *= podeaPersonalizata.getDuritate();
        }
        for (Decoratiune decoratiune : decoratiuni) {
            gradIncediuBaza += decoratiune.getRiscIncediu();
        }
        return gradIncediuBaza;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "nume='" + nume + '\'' +
                ", suprafata=" + suprafata +
                ", numarIntrari=" + numarIntrari +
                ", podeaPersonalizata=" + podeaPersonalizata +
                ", decoratiuni=" + decoratiuni +
                '}';
    }

    public static class Builder {
        private final String nume;
        private final double suprafata;
        private int numarIntrari = 1;
        private Podea podeaPersonalizata = null;
        private List<Decoratiune> decoratiuni = List.of();

        public Builder(String nume, double suprafata) {
            this.nume = nume;
            this.suprafata = suprafata;
        }

        public Builder numarIntrari(int numarIntrari) {
            this.numarIntrari = numarIntrari;
            return this;
        }

        public Builder podeaPersonalizata(Podea podeaPersonalizata) {
            this.podeaPersonalizata = podeaPersonalizata;
            return this;
        }

        public Builder decoratiuni(List<Decoratiune> decoratiuni) {
            this.decoratiuni = decoratiuni;
            return this;
        }

        public Magazin build() {
            return new Magazin(this);
        }
    }
}