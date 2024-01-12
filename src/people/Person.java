package people;

import java.util.Objects;
import nature.Describable;

public abstract class Person implements Describable {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true; //если ссылки на обьекты равны
        }
        if (other == null) {
            return false; //если ссылка нулевая
        }
        if (getClass() != other.getClass()) {
            return false; //сравнение классов this и other
        }
        Person that = (Person) other;
        //сравнение всех полей
        return (getName() == that.getName() );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return this.getClass().getName() + '{' + "name= " + this.getName() + '}';
    }

}

