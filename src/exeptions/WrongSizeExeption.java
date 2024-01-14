package exeptions;

public class WrongSizeExeption extends RuntimeException{
    public WrongSizeExeption(String n){
        super("несуществующий размер " + n);
    }
}
