public class Decoratiune {
    private final Material material;

    public Decoratiune(Material material) {
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public double getRiscIncediu() {
        return material.getRiscIncediu();
    }

    @Override
    public String toString() {
        return "Decoratiune{" +
                "material=" + material +
                '}';
    }
}