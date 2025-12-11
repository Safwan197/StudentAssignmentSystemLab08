package studentlab;

public class LoggerThread extends Thread {
    @Override
    public void run() {
        System.out.println("[LOGGER] Logger thread started.");
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1500);
                System.out.println("[LOGGER] Logger running...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("[LOGGER] Logger thread finished.");
    }
}
