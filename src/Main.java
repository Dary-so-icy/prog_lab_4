import people.*;
import nature.*;

public class Main {
    public static void main(String[] args) {
        //глаголы
        // создать объекты

        // может удалить нафиг энум places
        Snow rocks = new Snow("замерзшее каменное крошево", 10);
        Airplane plane = new Airplane("самолет", 0);
        Snow snowstorm = new Snow("снежная пыль", 50);
        We we = new We("мы");
        Building construction = new Building("постройки", 52);
        Building ruins = new Building("руины", 2);
        Snow mud = new Snow("туманная дымка", 0);
        Jungle jungle = new Jungle("джунгли", 15);
        Sun sun = new Sun("лучи солнца", 100);
        Building city = new Building("город", 75);


        we.participle("Поднявшись на вершину башни");
        we.discover(rocks);

        construction.participle(Location.WEST.getLocation());
        construction.top(+100); // можно еще как то с местами поиграть и энумами, указывать где находятся на западе или на востоке...
        construction.participle(Location.EAST.getLocation());
        construction.top(-100);//как то надо разграничить конструкции что бы не было будто 1 обект

        //city.; казался древнее и угрюмее
        // можно поиграться с энумами и как то сделать метод апиаранс типо как выглядят предеметы вокруг
        sun.shine(ruins, +10);


        we.participle("Устало опустив рюкзаки, которые лишь чудом сохранились во время нашего отчаянного бегства");
        //это нахуя
        //короче предлагаю сделать обьект куртки и там у них в конструнторе пуговицы и их положение типо
        //застегнуты, растегнуты, сломаны
        //и может это как то передавать тип 1 заст 0 растег -1 сломнаны
        //ну или как то через тру форл
        //ну или тупо в лоб изменять их состояние
        // точно метод туда нужен чтобы этт все дело контолировать
        we.button_up_jacket();
        //мб сделать еще рюкзаки и их спускать ахххп
        //не ну а че делать то если говно выходит надо выкручиваться

        we.start("спуск");

        we.waiting_for_something(plane, Verbs.WAIT);
        plane.get_high();


        we.participle("Меньше чем через четверть часа");
        we.get_down("крутая древняя терасса");

        plane.get_high();


        we.stare(jungle); // а джунгли то где? позадиии это тоже можно как то через энумы указания мест сделать

        snowstorm.setlighting(+15);
        sun.shine(snowstorm, -50);


    }


}
