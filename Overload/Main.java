package Overload;

public class Main {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(3);
        l1.setTinggi(10);
        l1.displayMessage();

        Lingkaran l2 = new Lingkaran(4, 10);
        l2.displayMessage();
    }
}
