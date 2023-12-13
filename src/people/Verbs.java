package people;

public enum Verbs {
    DISCOVER("обнаружили, что"),
    DOWN("спускаться по"),
    DECAY("обветшали"),
    PUSH("пробиваться"),
    SEEM("казаться"),
    LIGHT("переливалась"),
    BONES("пробирал до костей"),
    BUTTON("застегнули"),
    START("начали"),
    WALK("побрели по"),
    WAIT("дожидался"),
    SILENT("ни словом не обмолвились"),
    APPEAR("проступит"),
    SEE("был виден"),
    STOP("остановились"),
    LOOK("посмотрели на"),
    DISAPPEAR("рассеялась"),
    TOP("устремились ввысь");
    private final String verb;

    Verbs(String verb) {
        this.verb = verb;
    }

    public String getVerb() {
        return verb;
    }

}
