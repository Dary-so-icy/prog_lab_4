package nature;

public enum Places {
    HILL("вершины великих гор"),
    RAY("косые лучи"),
    STROY("строй покосившихся руин"),
    CITY("город"),
    DUST("снежная пыль"),
    COLD("Мороз"),
    AIRPLANE("самолет"),
    LABYRINTH("каменный лабиринт"),
    SECRET("тайна");
    private final String place;


    Places(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }
}
