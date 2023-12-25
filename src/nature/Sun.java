package nature;

import people.Verbs;

public class Sun extends Environment{
    protected String participle; //причастие, деепричатие или какое-нибудь дополнение

    public Sun(String name, int high) {
        super(name, high);
    }

    public void shine(Environment ob, int amount){
        ob.setlighting(amount);
        ob.getLight(this);
    }

    @Override
    public void participle(String word) {
        this.participle = word;
    }

    public void getDescription(String verb) {
        if (this.participle != null) {
            System.out.println(this.participle + ", " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }
}
