package Items;

public class Bags extends Item {
    protected String position;
    protected Material made_of;
    protected boolean carry;

    public Bags(String name, int size, boolean carry, Material mat) {
        super(name, size);
        this.carry = carry;
        this.made_of = mat;
    }
    public void changePosition(){
        this.carry = !(this.carry);
    }
    public void getPosition(){
        if (this.carry) {
            position = "висят на спине";
        } else {
            position = "опущены на землю";
        }
        System.out.println(this.made_of.getMaterial() + " " + this.name + " " + position);
    }


}
