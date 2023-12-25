package nature;

import people.Participle;

import java.util.Objects;

public abstract class Environment implements Participle, Describable {
    protected String name;
    protected int height;
    protected int lighting;

    public Environment(String name, int height ) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getH() {
        return this.height;
    }

    public void setlighting(int degree){
        this.lighting = degree;
    }

    public void getLight(Environment item){
        if(this.lighting < 0){
            System.out.println("Oсвещаемость " + this.name + " уменьшилось из-за " + item.getName());
        } else if (this.lighting == 0) {
            System.out.println(this.name + " освещаемость не изменилась");
        } else {
            System.out.println("Oсвещаемость " + this.name + " увеличилась из-за " + item.getName());
        }
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
