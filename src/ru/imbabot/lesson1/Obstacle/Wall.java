package ru.imbabot.lesson1.Obstacle;

import ru.imbabot.lesson1.Participants.Participant;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
