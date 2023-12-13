package nature;

public enum Places {
    COLD("Мороз"),
    LABYRINTH("каменный лабиринт"),
    SECRET("Страшная роковая тайна");
    private final String place;


    Places(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
