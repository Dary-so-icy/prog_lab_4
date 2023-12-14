package nature;

import people.Participle;

import java.util.Objects;

public abstract class Environment implements Participle, Describable {
    protected String name;
    private String adj;
    //protected Verbs verb;

    public Environment(String name) {
        this.name = name;
    }

    public Environment(String name, String adj) {
        this.name = name;
        this.adj = adj;
    }

    public String getName() {
        return name;
    }

    public String getAdj() {
        return adj;
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
        Environment that = (Environment) other;
        //сравнение всех полей
        return (getName() == that.getName() && getAdj() == that.getAdj());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, adj);
    }

    @Override
    public String toString(){
        return this.getClass().getName() + '{' + "name= " + this.getName() + ", adjictive=" + this.adj + '}';
    }


}
