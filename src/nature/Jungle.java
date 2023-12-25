package nature;

import people.Verbs;

public class Jungle extends Environment {
    protected String participle;

    public Jungle(String name, int height) {
        super(name, height);
    }


    @Override
    public void participle(String word) {
        this.participle = word;
    }

    @Override
    public void getDescription(String verb) {

    }
}
