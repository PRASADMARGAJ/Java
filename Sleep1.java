
// Using try-catch method


// public class SleepThread {
//     public static void main(String[] args) {
//         try{
//             for(int i=1; i<5; i++){
//                 System.out.println("Sleep count :" +i);
//                 Thread.sleep(2000,100);
//             }
//         }
//         catch(InterruptedException e){
//             System.out.println("Interrupated");
//         }
//     }
// }

class SleepThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i < 5; i++) {
                System.out.println("Sleep count: " + i);
                Thread.sleep(2000, 100);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

// Using InterruptedException method


public class Sleep1 {
    public static void main(String[] args) throws InterruptedException {
        SleepThread st1 = new SleepThread();
        st1.start();
        st1.join(3000);
        for (int i = 1; i < 5; i++) {
            System.out.println("Main Count: " + i);
        }
    }
}


