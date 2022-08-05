package ru.imbabot.lesson1.Obstacle;

import ru.imbabot.lesson1.Participants.Participant;

public class Track implements Obstacle {
    private int length;

    public Track(int length){
        this.length = length;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(length);
    }
}
