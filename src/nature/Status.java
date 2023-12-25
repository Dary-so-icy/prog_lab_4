package nature;

public enum Status {
    STRANGE("угрюмый"),
    OLD("старый"),
    BRILLIANT("не поврежденный"),
    GOOD("устойчиныe"),
    SOSO("покосившиеся"),
    TERRIBLE("обветшалые");
    private final String status;
    Status(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
