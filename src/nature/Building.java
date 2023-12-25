package nature;



public class Building extends Environment {
    protected String adding;

    public Building(String name, int height, int condition) {
        super(name, height);
        if (condition > 75) {
            this.name = Status.BRILLIANT.getStatus() + " " + this.name;
        } else if (50 < condition) {
            this.name = Status.GOOD.getStatus() + " " + this.name;
        } else if (25 < condition) {
            this.name = Status.SOSO.getStatus() + " " + this.name;
        } else {
            this.name = Status.TERRIBLE.getStatus() + " " + this.name;
        }

    }

    public void appearance(Status status){
        System.out.println(this.name + " выглядеть: " + status.getStatus());
    }

    public void top(int x) {
        if (x > 0) {
            this.getDescription("выситься");
        } else if (x < 0) {
            this.getDescription("уменьшались");
        } else {
            this.getDescription("Оставались преждними ");
        }
    }

    @Override
    public void participle(String word) {
        this.adding = word; // какое то дополнение к класу билдинг, его характеристики
    }

    public void getDescription(String verb) {
        if (this.adding != null) {
            System.out.println(this.adding + ", " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }

}
