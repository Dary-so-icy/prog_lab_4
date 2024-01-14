package Items;

import exeptions.WrongSizeExeption;

import java.util.Objects;

public abstract class Item {
    private final int size;
    private final String name;

    public Item(String name, int size) throws WrongSizeExeption {
        if(size < 0){throw new WrongSizeExeption(name);}
        this.size = size;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item object = (Item) o;
        return size == object.size && name == object.name ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, name);
    }

    @Override
    public String toString() {
        return "PhysicalObject{" +
                "name=" + name +
                ", size=" + size +
                '}';
    }
}
