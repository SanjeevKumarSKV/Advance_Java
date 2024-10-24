import java.beans.IntrospectionException;
class MultiThread implements Runnable {
    public void run() {
        System.out.println("Thread running " + Thread.currentThread().threadId());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ImplemetThread {
    public static void main(String[] args)throws RuntimeException {
        for (int i = 0; i < 5; i++) {
            Thread sk = new Thread(() -> {
                System.out.println("Thread Running" + Thread.currentThread().getId());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread aweke" + Thread.currentThread().getId());
            });
            sk.start();
        }
    }
}