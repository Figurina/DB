package PantofiBuilderFactory;
import PantofiBuilderFactory.ExceptiePersonalizarePantof;

import java.util.ArrayList;
import java.util.List;

public final class Pantof {
    private final String tip; // balerini, tenisi, ghete, stiletto
    private final int marime; // marimea pantofilor intre 35 si 45
    private final double dimensiuneToc; // dimensiunea tocului intre 0.5 si 12.5
    private final String materialBaza; // materialul de baza
    private final List<String> materialeSecundare; // materiale secundare optionale
    private final List<String> mesajeText; // mesaje text optionale

    private Pantof(Builder builder) {
        this.tip = builder.tip;
        this.marime = builder.marime;
        this.dimensiuneToc = builder.dimensiuneToc;
        this.materialBaza = builder.materialBaza;
        this.materialeSecundare = builder.materialeSecundare;
        this.mesajeText = builder.mesajeText;
    }

    // Getteri pentru toate campurile
    public String getTip() { return tip; }
    public int getMarime() { return marime; }
    public double getDimensiuneToc() { return dimensiuneToc; }
    public String getMaterialBaza() { return materialBaza; }
    public List<String> getMaterialeSecundare() { return materialeSecundare; }
    public List<String> getMesajeText() { return mesajeText; }

    @Override
    public String toString() {
        return "Pantof{" +
                "tip='" + tip + '\'' +
                ", marime=" + marime +
                ", dimensiuneToc=" + dimensiuneToc +
                ", materialBaza='" + materialBaza + '\'' +
                ", materialeSecundare=" + materialeSecundare +
                ", mesajeText=" + mesajeText +
                '}';
    }

    // Clasa Builder
    public static class Builder {
        private final String tip;
        private final int marime;
        private final double dimensiuneToc;
        private final String materialBaza;
        private List<String> materialeSecundare = new ArrayList<>();
        private List<String> mesajeText = new ArrayList<>();

        public Builder(String tip, int marime, double dimensiuneToc, String materialBaza) {
            this.tip = tip;
            this.marime = marime;
            this.dimensiuneToc = dimensiuneToc;
            this.materialBaza = materialBaza;
        }

        public Builder adaugaMaterialSecundar(String material) {
            this.materialeSecundare.add(material);
            return this;
        }

        public Builder adaugaMesajText(String mesaj) {
            this.mesajeText.add(mesaj);
            return this;
        }

        public Pantof build() throws ExceptiePersonalizarePantof {
            valideaza();
            return new Pantof(this);
        }

        private void valideaza() throws ExceptiePersonalizarePantof {
            // Validare marime pantof
            if (marime < 35 || marime > 45) {
                throw new ExceptiePersonalizarePantof("Marimea pantofilor trebuie sa fie intre 35 si 45.");
            }

            // Validare dimensiune toc
            if (dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {
                throw new ExceptiePersonalizarePantof("Dimensiunea tocului trebuie sa fie intre 0.5 si 12.5.");
            }

            // Validare materiale secundare in functie de tipul pantofilor
            if (tip.equals("stiletto") && materialeSecundare.size() > 2) {
                throw new ExceptiePersonalizarePantof("Pantofii stiletto pot avea maxim 2 materiale secundare.");
            }

            // Validare mesaje text
            int lungimeTotalaMesaje = mesajeText.stream().mapToInt(String::length).sum();
            if (lungimeTotalaMesaje >= marime) {
                throw new ExceptiePersonalizarePantof("Lungimea totala a mesajelor text trebuie sa fie mai mica decat marimea pantofilor.");
            }
        }
    }
}