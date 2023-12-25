package nature;

import people.Verbs;

public class Snow extends Environment {
    protected String participle; //причастие, деепричатие или какое-нибудь дополнение

    public Snow(String name, int height) {
        super(name, height);
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
