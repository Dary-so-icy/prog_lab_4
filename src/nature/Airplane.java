package nature;

import people.Verbs;

public class Airplane extends Environment {
    protected String participle;

    public Airplane(String name, int high_of_plane) {
        super(name, high_of_plane);
    }

    public void get_high(){
        if(this.height == 0){
            System.out.println(this.name + " стоит на земле и ожидает взлета");
        }
        else {
            System.out.println(this.name + " летит на высоте: " + this.height);
        }
    }
    public void getDescription(String verb) {
        if (this.participle != null) {
            System.out.println(this.participle + " " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }

    public void participle(String word) {
        this.participle = word;
    }
}
