public class MultiThreading {
    public static void main(String[] args) {
        Current t1 = new Current();
        Current t2 = new Current();

        t1.start();
        t1.setName("The Captain America");
        t2.start();

        for (int i = 1; i < 5; i++) {
            System.out.println("Main thread " + i);
        }
        System.out.println("Inside main() method: " + Thread.currentThread().getName());
        Thread.currentThread().setName("Avenger Thread");
        System.out.println("Inside main() method After :" + Thread.currentThread().getName());
    }
}

class Current extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Child thread " + i);
        }
        System.out.println("Inside run() method: " + Thread.currentThread().getName());
    }
}
