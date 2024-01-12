package people;

import nature.Environment;

public class We extends Person implements Participle{
    protected String participle;

    public We(String name) {
        super(name);
    }

    public void participle(String word) {
        this.participle = word; // причастия или дополнения у экземпляра класса
    }


    public void discover(Environment surround) {
        System.out.println(this.participle + ", " + this.getName() + ' ' + Verbs.DISCOVER.getVerb() + " должны " +
                Verbs.DOWN.getVerb() + " " + surround.getName());
    }

    public void get_down(String road) {
        System.out.println(this.participle + ", " + this.getName() + ' ' + Verbs.DOWN.getVerb() + " " + road);
    }

    public void button_up_jacket() {
        System.out.println(this.participle + ", " + this.getName() + ' ' + Verbs.BUTTON.getVerb() + " пуговицы на куртках");
    }

    public void start(String doing_what) {
        System.out.println(this.getName() + ' ' + Verbs.START.getVerb() + " " + doing_what);
    }

    public void stare(Environment mystery) {
        System.out.println(this.getName() + ' ' + Verbs.LOOK.getVerb() + ": " + mystery.getName());
    }

    @Override
    public void getDescription(String verb) {
        if (this.participle != null) {
            System.out.println(this.participle + " " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }


}
