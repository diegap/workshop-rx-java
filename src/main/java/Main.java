import example01.Example02;

public class Main {

    public static void main(String[] args) {
        new Example02().complex();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
