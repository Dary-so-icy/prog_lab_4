package people;

public class Denford extends Person{
    public Denford(String name) {
        super(name);
    }
    public void remember(String dream, boolean isInMind){
        if(isInMind){
            getDescription("помнит про " + dream);
        }else {
            getDescription("не помнит про " + dream);
        }
    }



    public void getDescription(String verb) {
        System.out.println(this.name + " " + verb);
    }

}
