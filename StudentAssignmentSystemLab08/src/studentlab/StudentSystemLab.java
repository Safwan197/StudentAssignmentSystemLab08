package studentlab;
public class StudentSystemLab {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Student Assignment Submission System ===");

        AssignmentQueue queue = new AssignmentQueue();

        Student student1 = new Student("Ali", queue);
        Student student2 = new Student("Sara", queue);

        // Total assignments = 2 students * 3 assignments each = 6
        Grader grader = new Grader(queue, 6);

        LoggerThread logger = new LoggerThread(); // Optional

        // Start all threads
        student1.start();
        student2.start();
        grader.start();
        logger.start();

        // Wait for threads to finish
        student1.join();
        student2.join();
        grader.join();
        logger.join();

        System.out.println("=== All assignments processed successfully! ===");
    }
}
