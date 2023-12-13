package nature;

import people.Verbs;

public class Jungle extends Environment{
    protected String participle;
    public Jungle(String name, String adj) {
        super(name, adj);
    }

    @Override
    public void getDescription(Verbs verb) {
        System.out.println(this.getAdj() + " " + this.getName());
    }

    @Override
    public void participle(String word) {
        this.participle = word;
    }
}
