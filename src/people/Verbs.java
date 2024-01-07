package people;

public enum Verbs {
    DISCOVER("обнаружили, что"),
    DOWN("спускаться по"),
    BUTTON("застегнули"),
    START("начали"),
    LOOK("посмотрели на");
    private final String verb;

    Verbs(String verb) {
        this.verb = verb;
    }

    public String getVerb() {
        return verb;
    }

}
