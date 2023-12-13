package nature;

import people.Verbs;

public class Sun extends Environment{
    protected String participle; //причастие, деепричатие или какое-нибудь дополнение

    public Sun(String name, String adj) {
        super(name, adj);
    }

    @Override
    public void participle(String word) {
        this.participle = word;
    }

    @Override
    public void getDescription(Verbs verb) {
        if (this.participle != null) {
            System.out.println(this.participle + ", " + this.getAdj() + " " + this.getName() + " " + verb.getVerb());
        } else {
            System.out.println(this.getAdj() + " " + this.getName() + " " + verb.getVerb());
        }
    }
}
