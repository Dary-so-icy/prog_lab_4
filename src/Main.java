import Items.*;
import people.*;
import nature.*;

public class Main {
    public static void main(String[] args) {

        Denford den = new Denford("Дэнчик");

        Snow rocks = new Snow("замерзшее каменное крошево", 10);
        Airplane plane = new Airplane("самолет", 0);
        Snow snowstorm = new Snow("снежная пыль", 50);
        We we = new We("мы");

        Building construction = new Building("постройки", 52, 74);
        Building house = new Building("здания", 40, 40);
        Building ruins = new Building("руины", 2, 15);
        Building city = new Building("город", 75, 80);
        Building tower = new Building("цилиндрическая башня", 100, 50);

        Snow mud = new Snow("туманная дымка", 0);
        Jungle jungle = new Jungle("джунгли", 15);
        Sun sun = new Sun("лучи солнца", 100, 1000);

        Bags bag = new Bags("рюкзаки", 50, true, Material.CLOTH);

        Coat coat = new Coat("куртка", 150);

        den.remember("детали бегства", false);
        den.remember("громадная пещера", true);
        den.remember("коридоры и залы мертвого города как во сне", true);
        we.getDescription("отрезвились из-за: " + sun.getName());
        sun.shine(tower);

        we.participle("Поднявшись на вершину башни");
        we.discover(rocks);

        construction.participle(Location.WEST.getLocation());
        construction.top(+100);
        house.participle(Location.EAST.getLocation());
        house.top(-100);

        city.appearance(Status.STRANGE);
        sun.shine(ruins);


        bag.changePosition();
        bag.getPosition();
        coat.getInfoButtons();
        //we.button_up_jacket();

        we.start("спуск");

        plane.get_high();


        we.participle("Меньше чем через четверть часа");
        we.get_down("крутая древняя терасса");

        plane.get_high();

        jungle.participle(Location.BEHIND.getLocation());
        jungle.getDescription("остались");
        we.stare(jungle);


        mud.participle(Location.WEST.getLocation());
        sun.changeBr(-1000);
        sun.shine(mud); // я уже просто блоять запуталась что тут и как работает но вроде у меня лучи вложенный класс а как тогда ярокость я меняю и почему и зачем стоько вопросов
        

        snowstorm.change_height(+25);
        snowstorm.direction();

    }




}
