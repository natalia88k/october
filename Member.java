package October1;

public class Member {
    private String name;
    private int maxJump;
    private boolean hasCompletedCourse;

    public Member(String name, int maxJump) {
        this.name = name;
        this.maxJump = maxJump;
        this.hasCompletedCourse = true;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public boolean isHasCompletedCourse() {
        return hasCompletedCourse;
    }

    public void setHasCompletedCourse(boolean hasCompletedCourse) {
        this.hasCompletedCourse = hasCompletedCourse;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", max jump: " + maxJump);
    }
}
