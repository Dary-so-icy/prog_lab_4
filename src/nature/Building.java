package nature;

import people.Verbs;

public class Building extends Environment {
    protected String adding;

    public Building(String name, int height) {
        super(name, height);
    }

    public void top(int x) {
        if (x > 0) {
            this.getDescription("выситься");
        } else if (x < 0) {
            this.getDescription("уменьшались");
        } else {
            this.getDescription("Оставались преждними ");
        }
    }

    @Override
    public void participle(String word) {
        this.adding = word; // какое то дополнение к класу билдинг, его характеристики
    }

    public void getDescription(String verb) {
        if (this.adding != null) {
            System.out.println(this.adding + ", " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }

}
