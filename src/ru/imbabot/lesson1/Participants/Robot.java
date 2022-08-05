package ru.imbabot.lesson1.Participants;

public class Robot implements Participant {

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


    public Robot(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.active = true;
    }

    @Override
    public void run(int distance) {
        if (active == true && maxDistance >= distance) {
            System.out.println("robot run success");
        }else if (active == true && maxDistance < distance){
            System.out.println("robot leaves distance");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (active == true && maxHeight >= height) {
            System.out.println("robot jump success");
        }else if (active == true && maxHeight < height){
            System.out.println("robot leaves distance");
            active = false;
        }
    }
}
