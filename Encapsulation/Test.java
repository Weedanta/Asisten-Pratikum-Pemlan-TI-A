public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");
        s1.setMark(90); // Diperbaiki: parameter int, bukan String

        System.out.println("s1Name is " + s1.getName()); // Diperbaiki: getName()
        System.out.println("s1Mark is " + s1.getMark()); // Diperbaiki: getMark()

        // Baris di bawah error karena akses langsung ke atribut private
        // System.out.println("name dan mark " + s1.name + " " + s1.mark);
    }
}