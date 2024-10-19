package Day_29;

class LoopingInThread implements Runnable {
    private String threadName;

    LoopingInThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Loop iteration: " + i);
            try {
                Thread.sleep(500); // Pause for a moment between iterations
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LoopingInThread("Thread 1"));
        Thread thread2 = new Thread(new LoopingInThread("Thread 2"));
        Thread thread3 = new Thread(new LoopingInThread("Thread 3"));
        Thread thread4 = new Thread(new LoopingInThread("Thread 4"));

        thread1.setPriority(1);
        thread2.setPriority(10);
        thread3.setPriority(5);
        thread4.setPriority(3);

        thread1.start(); // Starts the first thread
        thread2.start(); // Starts the second thread
        thread3.start(); // Starts the first thread
        thread4.start(); // Starts the second thread
    }
}
