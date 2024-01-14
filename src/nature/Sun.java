package nature;

public class Sun extends Environment{
    protected String participle; //причастие, деепричатие или какое-нибудь дополнение
    Ray ray;
    public Sun(String name, int high, int am) {
        super(name, high);
        ray = new Ray(am);
    }

    public class Ray{ // внутренний класс
        private int brightness;
        public Ray(int br){
            this.brightness = br;
        }
        int getBright(){
            return brightness;
        }
        void changeBrightness(int amount){
            this.brightness += amount;
        }

    }
    public void shine(Environment item){
        if (this.ray.getBright() <0){
            System.out.println(item.name + " рассеялась в " + this.getName());
        } else if (this.ray.getBright() == 0) {
            System.out.println(item.name + " освещаемость не изменилась");
        } else {
            System.out.println("Oсвещаемость " + item.name + " увеличилась из-за " + this.getName());
        }
    }

    @Override
    public void participle(String word) {
        this.participle = word;
    }
    public void changeBr(int amount){
        this.ray.changeBrightness(amount);
    }
    public void getDescription(String verb) {
        if (this.participle != null) {
            System.out.println(this.participle + ", " + this.getName() + " " + verb);
        } else {
            System.out.println(this.getName() + " " + verb);
        }
    }
}
