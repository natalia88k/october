package October1;

public class Main {
    public static void main(String[] args) {
        int[] barriers = {2, 3, 2};
        Course c = new Course(barriers);
        Team team = new Team("Pirozhki");
        c.doIt(team);
        team.printMembersWhoCompleteCourse();

    }
}
