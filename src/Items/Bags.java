package Items;

public class Bags extends Item {
    protected String position;
    protected Material made_of;
    protected boolean isCarried;

    public Bags(String name, int size, boolean isCarried, Material mat) {
        super(name, size);
        this.isCarried = isCarried;
        this.made_of = mat;
    }
    public void changePosition(){
        this.isCarried = !(this.isCarried);
        getPosition();
    }
    public void getPosition(){
        if (this.isCarried) {
            position = "висят на спине";
        } else {
            position = "опущены на землю";
        }
        System.out.println(this.made_of.getMaterial() + " " + this.getName() + " " + position);
    }




}
