// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("Hii");
//             try {
//                 Thread.sleep(300);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("Hello");
//             try {
//                 Thread.sleep(300);
//             } catch (InterruptedException e) {
//                 // TODO Auto-generated catch block
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Runable {

    public static void main(String[] args) {
        Runnable obj1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hii");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}