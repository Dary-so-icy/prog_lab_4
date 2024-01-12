package Items;

public class Coat extends Item{
    protected boolean isClosed;

    public Coat(String name, int size) {
        super(name, size);
        this.isClosed = false; //застегнуты true расстегнуты false
    }
    //anonimus
    Button up = new Button() {
        @Override
        public void getPosition(){
            System.out.println("Застегнуты пуговицы на " + Coat.this.getName());
        }
    };
    Button down = new Button() {
        @Override
        public void getPosition(){
            System.out.println("Расстегнуты пуговицы на " + Coat.this.getName());
        }
    };

    public void getInfoButtons(){
        if(this.isClosed){
            up.getPosition();
        }else{
            down.getPosition();
        }
    }
    public void changeButt(){
        this.isClosed = !isClosed;
    }
}
