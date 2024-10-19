package Day_29;

class ThreadLifecycle extends Thread {
    @Override
    public void run() {
        try {
            // Running state
            System.out.println(Thread.currentThread().getName() + " is RUNNING.");

            // Simulating a waiting/blocked state by making the thread sleep
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " is in a TIMED_WAITING state (sleep).");

            synchronized (this) {
                // Simulating a waiting state
                wait(500);
                System.out.println(Thread.currentThread().getName() + " is in WAITING state.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // After completion, the thread enters the TERMINATED state
        System.out.println(Thread.currentThread().getName() + " is TERMINATED.");
    }

    public static void main(String[] args) {
        // Creating the thread (New state)
        ThreadLifecycle thread = new ThreadLifecycle();
        thread.setName("Thread- Ascii education");
        System.out.println(thread.getName() + " is in NEW state.");

        // Starting the thread (Runnable state)
        thread.start();
        System.out.println(thread.getName() + " is in RUNNABLE state.");

        try {
            // Ensure the main thread waits for this thread to finish execution
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
