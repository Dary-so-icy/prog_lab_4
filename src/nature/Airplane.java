package nature;

import people.Verbs;

public class Airplane extends Environment {
    protected String participle;

    public Airplane(String name, String adj) {
        super(name, adj);
    }

    public void getDescription(Verbs verb) {
        if (this.participle != null) {
            System.out.println(this.participle + " " + this.getAdj() + " " + this.getName() + " " + verb.getVerb());
        } else {
            System.out.println(this.getAdj() + " " + this.getName() + " " + verb.getVerb());
        }
    }

    public void participle(String word) {
        this.participle = word;
    }
}
