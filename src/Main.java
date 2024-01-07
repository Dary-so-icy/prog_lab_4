import Items.Bags;
import Items.Material;
import people.*;
import nature.*;

public class Main {
    public static void main(String[] args) {

        Snow rocks = new Snow("замерзшее каменное крошево", 10);
        Airplane plane = new Airplane("самолет", 0);
        Snow snowstorm = new Snow("снежная пыль", 50);
        We we = new We("мы");

        Building construction = new Building("постройки", 52, 74);
        Building house = new Building("здания", 40, 40);
        Building ruins = new Building("руины", 2, 15);
        Building city = new Building("город", 75, 80);

        Snow mud = new Snow("туманная дымка", 0);
        Jungle jungle = new Jungle("джунгли", 15);
        Sun sun = new Sun("лучи солнца", 100);

        Bags bag = new Bags("рюкзаки", 50, true, Material.CLOTH);

        we.participle("Поднявшись на вершину башни");
        we.discover(rocks);

        construction.participle(Location.WEST.getLocation());
        construction.top(+100);
        house.participle(Location.EAST.getLocation());
        house.top(-100);

        city.appearance(Status.STRANGE);
        sun.shine(ruins, +10);


        bag.changePosition();
        bag.getPosition();
        we.button_up_jacket();

        we.start("спуск");

        plane.get_high();


        we.participle("Меньше чем через четверть часа");
        we.get_down("крутая древняя терасса");

        plane.get_high();

        jungle.participle(Location.BEHIND.getLocation());
        jungle.getDescription("остались");
        we.stare(jungle);


        mud.participle(Location.WEST.getLocation());
        mud.setlighting(-100);
        sun.shine(mud, -50);

        snowstorm.change_height(+25);
        snowstorm.direction();

    }




}
