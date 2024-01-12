package nature;


public class Snow extends Environment {
    protected String participle; //причастие, деепричатие или какое-нибудь дополнение
    private static final int figure = 6;
    public Snow(String name, int height) {
        super(name, height);
    }

    public void change_height(int h){
        this.height += h;
    }
    @Override
    public void participle(String word) {
        this.participle = word;
    }


    public void getDescription(String verb) {
        if (this.participle != null) {
            System.out.println(this.participle + ", " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }

    public void direction() {
        if (this.height > 25) {
            this.getDescription("устремился ввысь");
        } else if (this.height < 15) {
            this.getDescription("начал падать");
        } else {
            this.getDescription("продлолжил лететь ");
        }
    }

    // вложенный static класс
    public static class Snowflake{
        private String name;

        Snowflake(){
            this.name = "Снежинка";
        }
        public static int getLines(){
            return figure;
        }
    }
}
