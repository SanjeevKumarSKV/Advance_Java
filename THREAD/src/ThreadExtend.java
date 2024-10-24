class Multithread extends Thread{
    public void run(){
        System.out.println("THREAD IS RUNNING"+Thread.currentThread().getId());
    try {
        Thread.sleep(2000);
    }catch (InterruptedException e){
        throw new RuntimeException(e);
    }
        System.out.println("thread wake up"+ Thread.currentThread().getId());
    }
}
public class ThreadExtend {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++){
            Multithread  sk = new Multithread();
            sk.start();
        }
    }
}