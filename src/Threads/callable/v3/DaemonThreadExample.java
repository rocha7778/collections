package Threads.callable.v3;

public class DaemonThreadExample {
    public static void main(String[] args) {
        // Creating a daemon thread
        Thread daemonThread = new Thread(new DaemonTask());
        
        // Setting the thread as daemon
        daemonThread.setDaemon(true);
        
        // Starting the daemon thread
        daemonThread.start();
        
        // Main thread execution
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Main Thread Exiting...");
    }
}

class DaemonTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Daemon Thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 0.5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Daemon Thread Exiting...");
    }
}

