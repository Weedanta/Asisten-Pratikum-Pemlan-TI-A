package Overload;

import java.util.Scanner;

public class Overloading {
     public static void HitungLuas(int a, int b) {
        int nilai = a * b;
        System.out.println("Maka hasil luas : " + nilai);
    }

    public static double HitungLuas(double value, double value2) {
        double nilai = value * value2;
        return nilai;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("Masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);

        System.out.print("Masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("Masukkan nilai double 2 : ");
        double double2 = in.nextDouble();
        System.out.println("Maka hasil luas : " + HitungLuas(double1, double2));
    }
}
