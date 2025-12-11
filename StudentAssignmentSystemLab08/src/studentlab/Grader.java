package studentlab;

public class Grader extends Thread {
    private final AssignmentQueue queue;
    private final int totalAssignments;

    public Grader(AssignmentQueue queue, int totalAssignments) {
        this.queue = queue;
        this.totalAssignments = totalAssignments;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < totalAssignments; i++) {
                Thread.sleep(2000); // Simulate grading time
                queue.gradeAssignment();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
