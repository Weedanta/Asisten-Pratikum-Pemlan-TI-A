package Overload;

public class Lingkaran {
    int alas, tinggi;

    public Lingkaran(int alas) {
        this.alas = alas;
    }

    public Lingkaran(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public double hitungLuas() {
        double hasil = (double) (getTinggi() * getAlas()) / 2;
        return hasil;
    }

    public void displayMessage() {
        System.out.println("Hitung Luas : " + hitungLuas());
    }
}
