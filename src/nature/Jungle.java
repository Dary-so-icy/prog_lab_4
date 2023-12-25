package nature;


public class Jungle extends Environment {
    protected String participle;
    protected String location;

    public Jungle(String name, int height) {
        super(name, height);
    }

    public void setlocation(Location loc){
        this.location = loc.getLocation();
    }

    public String getlocation(){
        return this.location;
    }

    @Override
    public void participle(String word) {
        this.participle = word;
    }

    @Override
    public void getDescription(String verb) {
        if (this.getlocation() != null) {
            System.out.println(this.location + " " +this.participle + " " + this.getName() + " " + verb);
        } else{
            System.out.println(this.participle + " " + this.getName() + " " + verb);

        }
    }
}
