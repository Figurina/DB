public enum Material {
    LEMN(0.5),
    STICLA(1.5),
    METAL(1.0);

    private final double riscIncediu;

    Material(double riscIncediu) {
        this.riscIncediu = riscIncediu;
    }

    public double getRiscIncediu() {
        return riscIncediu;
    }
}