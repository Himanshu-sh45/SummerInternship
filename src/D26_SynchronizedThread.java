class Counter {

    private int count = 0;
    public synchronized void increment() {
        count++;
    }
    public synchronized int getCount() {
        return count;
    }

}

class MyThread extends Thread {

    private Counter counter;
    public MyThread(Counter counter) {
        this.counter = counter;
    }
    public void run() {
        for(int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

}

public class D26_SynchronizedThread {
    public static void main(String[] args) {

        Counter counter = new Counter();
        MyThread Thread1 = new MyThread(counter);
        MyThread Thread2 = new MyThread(counter);

        Thread1.start();
        Thread2.start();

        try {
            Thread1.join();
            Thread2.join();
        }
        catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Count: " + counter.getCount());

    }
}