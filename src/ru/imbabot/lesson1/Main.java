package ru.imbabot.lesson1;

import ru.imbabot.lesson1.Obstacle.Obstacle;
import ru.imbabot.lesson1.Obstacle.Track;
import ru.imbabot.lesson1.Obstacle.Wall;
import ru.imbabot.lesson1.Participants.Cat;
import ru.imbabot.lesson1.Participants.Human;
import ru.imbabot.lesson1.Participants.Participant;
import ru.imbabot.lesson1.Participants.Robot;

public class Main {
    public static void main(String[] args) {
        Participant[] p = {
                new Cat(100, 2),
                new Human(1000, 10),
                new Robot(10000, 100)
        };

        Obstacle[] obstacle = {
                new Wall(50),
                new Track(5000),
                new Track(100)
        };

        for (Participant p1 : p){
            for (Obstacle o : obstacle){
                o.doIt(p1);
            }
        }
    }
}
