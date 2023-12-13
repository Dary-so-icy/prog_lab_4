package people;

import nature.Environment;
import nature.Places;

import java.util.Locale;

public class We extends Person {
    protected String participle;

    public We(String name) {
        super(name);
    }

    @Override
    public void participle(String word) {
        this.participle = word;
    }

    public void discover(Environment surround) {
        System.out.println(this.participle + ", " + this.getName() + ' ' + Verbs.DISCOVER.getVerb() + " должны " +
                Verbs.DOWN.getVerb() + " " + surround.getAdj() + " " + surround.getName());
    }
    public void get_down(String road){
        System.out.println(this.participle + ", " + this.getName() + ' ' + Verbs.DOWN.getVerb() + " " + road );
    }
    public void button_up_jacket(){
        System.out.println(this.participle + ", " + this.getName() + ' ' + Verbs.BUTTON.getVerb() + " пуговицы на куртках");
    }
    public void start(String doing_what){
        System.out.println(this.getName() + ' ' + Verbs.START.getVerb() + " " + doing_what);
    }

    public void waiting_for_something(Environment mystery, Verbs verb){
        System.out.println(this.getName() + ' ' + Verbs.WALK.getVerb() + " " + Places.LABYRINTH.getPlace() +
                ", где " + mystery.getName() + " " + verb.getVerb());

    }

    @Override
    public void getDescription(Verbs verb) {
        if (this.participle != null){
            System.out.println(this.participle + " " + this.getName() + " " + verb.getVerb());
        }
        else{
            System.out.println(this.getName() + " " + verb.getVerb());
        }
    }
}
