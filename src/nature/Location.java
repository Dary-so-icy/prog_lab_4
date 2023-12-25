package nature;

public enum Location {
    EAST("восток"),
    WEST("запад"),
    SOUTH("юг"),
    NORTH("север");
    private final String loc;

    Location(String loc) {
        this.loc = loc;
    }

    public String getLocation() {
        return loc;
    }
}
