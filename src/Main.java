public class Main {
    public static void main(String[] args) {
        Thread k1 = new Klasse1();
        Thread k2 = new Thread(new Klasse2());
        k1.start();
        k2.start();
        System.out.println("Main fertig");
    }
}
