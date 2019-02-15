public class Klasse1 extends Thread{
    @Override
    public void run() {
        for (int i = 0;true;i++){
            System.out.println("Tick\t"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
