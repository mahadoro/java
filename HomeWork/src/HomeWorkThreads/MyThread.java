package HomeWorkThreads;

public class MyThread extends Thread {
    private final static int MAX_THREAD_COUNT = 50;

    public static void main(String[] args) throws InterruptedException {
        createNewThread(1);
    }

    private static void createNewThread(int count) throws InterruptedException {
        if (count > MAX_THREAD_COUNT) {
            return;
        }
        createNewThread(count + 1);
        Thread.sleep(100);
        Thread thread = new Thread(() -> System.out.println("Thread " + count + " created!"));
        thread.start();
    }
}

