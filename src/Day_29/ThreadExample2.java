package Day_29;

public class ThreadExample2 implements Runnable {

    @Override
    public void run() {
        System.out.println("TYhread is running");
    }

    public static void main(String[] args) {
        ThreadExample2 t1 = new ThreadExample2();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
