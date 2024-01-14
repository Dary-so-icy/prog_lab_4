package nature;

import exeptions.WrongHeightExeption;
import people.Participle;

import java.util.Objects;

public abstract class Environment implements Participle, Describable {
    protected String name;
    protected int height;

    public Environment(String name, int height) throws WrongHeightExeption {
        this.name = name;
        if (height < 0) {
            throw new WrongHeightExeption(this.name);
        }
        this.height = height;
    }


    public String getName() {
        return this.name;
    }

    public int getH() {
        return this.height;
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
        return (getName() == that.getName() && getH() == that.getH());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    @Override
    public String toString(){
        return this.getClass().getName() + '{' + "name= " + this.getName() + ", adjictive=" + this.height + '}';
    }


}
