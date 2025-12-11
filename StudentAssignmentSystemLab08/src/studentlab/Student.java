package studentlab;

public class Student extends Thread {
    private final String studentName;
    private final AssignmentQueue queue;

    public Student(String name, AssignmentQueue queue) {
        this.studentName = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                String assignment = studentName + "'s Assignment " + i;
                Thread.sleep(1000); // Simulate time to complete assignment
                queue.submitAssignment(assignment);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
