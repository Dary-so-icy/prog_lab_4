package nature;

import people.Verbs;

public class Building extends Environment {
    protected String adding;

    public Building(String name, String adj) {
        super(name, adj);
    }

    @Override
    public void participle(String word){
        this.adding = word;
    }

    @Override
    public void getDescription(Verbs verb){
        System.out.println(this.adding + ", " + this.getAdj() + ' ' + this.getName() + " " + verb.getVerb());
    }

}
