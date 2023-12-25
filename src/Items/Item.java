package Items;

import java.util.Objects;

public abstract class Item {
    protected int size;
    protected String name;

    public Item(String name, int size) {
        this.size = size;
        this.name = name;
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
