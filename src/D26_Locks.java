import java.util.concurrent.locks.ReentrantLock;

class LockExample {

    private final ReentrantLock l1 = new ReentrantLock();
    private int count = 0;
    public void increment() {
        l1.lock();
        try {
            count++;
            System.out.println("count: " + count);
        }
        finally {
            l1.unlock();
        }
    }
    public int getCount() {
        l1.lock();
        try {
            return count;
        }
        finally {
            l1.unlock();
        }
    }

}

public class D26_Locks {
    public static void main(String[] args) {

        LockExample example = new LockExample();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                example.increment();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + example.getCount());

    }
}