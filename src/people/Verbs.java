package people;

public enum Verbs {
    DISCOVER("обнаружили, что"),
    DOWN("спускаться по"),
    SLEEP("дремали"),
    DECAY("обветшали"),
    PUSH("пробиваться"),
    SEEM("казаться"),
    SHAKE("дрожать"),
    LIGHT("переливалась"),
    BONES("пробирал до костей"),
    SAVE("сохраниться"),
    BUTTON("застегнули"),
    START("начали"),
    WALK("побрели по"),
    WAIT("дожидаться"),
    SILENT("ни словом не обмолвились"),
    HELP("побудить спасаться"),
    SEE("был виден"),
    STOP("остановились"),
    LOOK("посмотреть"),
    TOP("устремились ввысь");
    private final String verb;

    Verbs(String verb) {
        this.verb = verb;
    }

    public String getVerb() {
        return verb;
    }

}
