package exeptions;

public class BusyPeople extends Exception{ //checked exception
    public BusyPeople(){
        super("нельзя делать 2 дела сразу! люди уже чем-то заняты");
    }
}
