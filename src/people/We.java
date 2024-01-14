package people;

import exeptions.BusyPeople;
import nature.Environment;

public class We extends Person implements Participle {
    protected String participle;
    protected boolean isDoingSth = false;
    protected String busy;

    public We(String name) {
        super(name);
        //this.isDoingSth = false;
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

    public void start(String doing_what) throws BusyPeople { // checked exeption
        if (isDoingSth) {
            throw new BusyPeople();
        }
        isDoingSth = true;
        busy = doing_what;
        System.out.println(this.getName() + " " + Verbs.START.getVerb() + " " + busy);
    }

    public void aboutWorld() {

        class World {
            private final String time = "время";
            private final String orientation = "ориентация";
            private final String name = "призрачный мир";
            private final String surname = "неизвестное измерение";

            public void disappear() {
                System.out.println(this.name + "(он же " + this.surname + "), где сейчас находимся " + We.this.getName()
                        + ", будто не имеет " + this.time + " и " + this.orientation);
            }
        }

        World world = new World();
        world.disappear();

    }

    public void tired() {
        System.out.println(this.name + " закончили: " + busy + ". Время отдохнуть!");
        busy = null;
        isDoingSth = false;
    }

    public void stare(Environment mystery) {
        System.out.println(this.getName() + ' ' + Verbs.LOOK.getVerb() + ": " + mystery.getName());
    }

    public void goodbye(String ob) {
        System.out.println(this.name + " попрощались с " + ob);
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
