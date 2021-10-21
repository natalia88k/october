package October1;

public class Team {
    private String name;
    private Member[] memberArray;

    public Team(String name) {
        this.name = name;
        this.memberArray = new Member[4];
        this.memberArray[0] = new Member("Emma", 5);
        this.memberArray[1] = new Member("Kamysh", 1);
        this.memberArray[2] = new Member("Ponochka", 3);
        this.memberArray[3] = new Member("Batonchik", 2);
    }

    public void printMembersWhoCompleteCourse() {
        for (int i = 0; i < this.memberArray.length; i++) {
            if (this.memberArray[i].isHasCompletedCourse()) {
                this.memberArray[i].printInfo();
            }
        }
    }

    public void printMembersInfo() {
        for (int i = 0; i < this.memberArray.length; i++) {
            this.memberArray[i].printInfo();
        }
    }

    public void jumpOverBarrier(int barrier) {
        for (int i = 0; i < this.memberArray.length; i++) {
            if (barrier > this.memberArray[i].getMaxJump()) {
                memberArray[i].setHasCompletedCourse(false);
            }

        }
    }
}
