package Encapsulation;

public class ContohnyaContoh {
    Contoh obj = new Contoh();

        // 1. Akses atribut public secara langsung (bisa)
        System.out.println("Public: " + obj.namaPublic); 

        // 2. Akses atribut private melalui getter (bisa)
        System.out.println("Private via Getter: " + obj.getNamaPrivate());

        // 3. Coba akses atribut private langsung (error!)
        // System.out.println("Private langsung: " + obj.namaPrivate);
}
