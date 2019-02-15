public class Klasse2 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; true; i++){
            System.out.println("Tack\t"+i);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
