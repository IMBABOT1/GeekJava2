package ru.imbabot.lesson1.Participants;

public class Cat implements Participant {

    private int maxDistance;
    private int maxHeight;

    public boolean active;

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public boolean isActive() {
        return active;
    }


    public Cat(int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.active = true;
    }


    @Override
    public void run(int distance) {
        if (active == true && maxDistance >= distance) {
            System.out.println("cat run success");
        }else if (active == true && maxDistance < distance){
            System.out.println("cat leaves distance");
            active = false;
        }
    }

    @Override
    public void jump(int height) {
        if (active == true && maxHeight >= height) {
            System.out.println("cat jump success");
        }else if (active == true && maxHeight < height){
            System.out.println("cat leaves distance");
            active = false;
        }
    }
}
