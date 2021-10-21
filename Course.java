package October1;

public class Course {

    private int[] barrierArray;

    public Course(int[] barrierArray) {
        this.barrierArray = barrierArray;
    }

    public void doIt(Team team) {
        for (int i = 0; i < barrierArray.length; i++) {
            team.jumpOverBarrier(barrierArray[i]);
        }
    }

}
