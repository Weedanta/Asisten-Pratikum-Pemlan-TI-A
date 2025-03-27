package Encapsulation;

public class Contoh {
  // Atribut public (bisa diakses langsung dari luar kelas)
  public String namaPublic = "Ini Public";

  // Atribut private (hanya bisa diakses di dalam kelas ini)
  private String namaPrivate = "Ini Private";

  // Method public untuk mengakses atribut private

  public String getNamaPrivate() {
    return namaPrivate;
  }

}
