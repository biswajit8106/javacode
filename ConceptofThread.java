// Program to implement the concept of thread.


class MyThread extends Thread {
    public void run() {
        System.out.println("My thread is running...");
    }
}

public class ConceptofThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}