package nature;

public enum Location {
    AHEAD("впереди"),
    BEHIND("сзади"),
    EAST("на востоке"),
    WEST("на западе"),
    SOUTH("на юге"),
    NORTH("на севере");
    private final String loc;

    Location(String loc) {
        this.loc = loc;
    }

    public String getLocation() {
        return loc;
    }
}
