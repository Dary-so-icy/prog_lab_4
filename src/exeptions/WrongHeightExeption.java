package exeptions;

public class WrongHeightExeption extends RuntimeException{ //uncheckted exception
    public WrongHeightExeption(String n) {
        super("ну и зачем передавать отрицательную выстоту в " + n + " ?!");
    }
}
