package se.joheli;

public class Main {

    public static void main(String[] args) {
        int counter = 0;

        while(true) {
            System.out.println("Testar automatiserade builds med Docker. (" + counter++ + ")");

            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
