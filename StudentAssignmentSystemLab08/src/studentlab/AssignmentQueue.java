package studentlab;

import java.util.ArrayList;
import java.util.List;

public class AssignmentQueue {
    private final List<String> queue = new ArrayList<>();
    private final int capacity = 5;

    public synchronized void submitAssignment(String assignmentName) throws InterruptedException {
        while (queue.size() == capacity) {
            wait();
        }
        queue.add(assignmentName);
        System.out.println("[SUBMIT] " + assignmentName + " submitted.");
        notify();
    }

    public synchronized String gradeAssignment() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        String assignment = queue.remove(0);
        System.out.println("[GRADE] " + assignment + " graded.");
        notify();
        return assignment;
    }
}
