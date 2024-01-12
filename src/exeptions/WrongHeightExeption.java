package exeptions;

public class WrongHeightExeption extends RuntimeException{
    public WrongHeightExeption() {
        super("ну и зачем передавать отрицательную выстоту ?!");
    }
}
