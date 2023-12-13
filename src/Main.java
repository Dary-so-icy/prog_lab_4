import people.*;
import nature.*;

public class Main {
    public static void main(String[] args) {
        Snow rocks = new Snow("крошево", "замерзшее каменное");
        Airplane plane = new Airplane("самолет", "наш");
        Snow snowstorm = new Snow("пыль", "снежная");
        We we = new We("мы");
        Building construction = new Building("постройки", "не менее громадные");
        Building ruins = new Building("здания", "низкие");

        we.participle("Поднявшись на вершину башни");
        we.discover(rocks);

        construction.participle("На западе");
        construction.getDescription(Verbs.TOP);

        ruins.participle("На востоке, где дремали вдали занесенные снегом вершины великих гор");
        ruins.getDescription(Verbs.DECAY);

        // написсатть сюда 3 предложение
        //Косые лучи низкого антарктического полночного солнца пробивались сквозь
        // строй покосившихся руин, Город казался еще древнее и угрюмее.

        //, Verbs.SHAKE
        snowstorm.participle("В воздухе");
        snowstorm.getDescription(Verbs.LIGHT);

        System.out.println(Places.COLD.getPlace() + " " + Verbs.BONES.getVerb());

        we.participle("Устало опустив рюкзаки, которые лишь чудом сохранились во время нашего отчаянного бегства");
        we.button_up_jacket();

        we.start("спуск");

        we.waiting_for_something(plane, Verbs.WAIT);

        we.participle("За весь путь");
        we.getDescription(Verbs.SILENT);

        we.participle("Меньше чем через четверть часа");
        we.get_down("крутая древняя терасса");

        plane.participle("Оттуда");
        plane.getDescription(Verbs.SEE);

        we.participle("На полпути");
        we.getDescription(Verbs.STOP);

        Snow mud = new Snow("дымка", "туманная");
    }

}
