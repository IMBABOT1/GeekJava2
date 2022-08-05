package ru.imbabot.lesson1.Participants;

public class Human implements Participant {

    private int maxDistance;
    private int maxHeight;

    private boolean active;

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean isActive() {
        return active;
    }


    public Human(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.active = true;
    }
    @Override
    public void run(int distance) {
        if (active == true && maxDistance >= distance) {
            System.out.println("human run success");
        }else if (active == true && maxDistance < distance){
            System.out.println("human leaves distance");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (active == true && maxDistance >= height) {
            System.out.println("human jump success");
        }else if (active == true && maxDistance < height){
            System.out.println("human leaves distance");
            active = false;
        }
    }
}
