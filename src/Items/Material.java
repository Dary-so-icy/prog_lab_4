package Items;

public enum Material {
    LEATHER("кожаные"),
    PLASTIC("пластиковые"),
    CARTOON("картонные"),
    CLOTH("тканенные");
    private final String material;

    Material(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}

