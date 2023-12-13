package people;

import nature.Describable;
import nature.Environment;
import nature.Places;

public abstract class Person implements Describable, Participle {
    protected String name;
    protected String view;
    //protected Places place;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

