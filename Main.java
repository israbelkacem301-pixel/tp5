package techstore;

public class Main {
    public static void main(String[] args) {
        Mobile m1 = new Mobile(1, "Galaxy", "MOB-001", 1500, 6.1, "Snapdragon", 8,
                SystemeExploitation.Android, 50, 12, 2, 4500);
        OrdinateurDeBureau d1 = new OrdinateurDeBureau(2, "Tour Pro", "PC-002", 2200, 24.0,
                "Core i7", 16, SystemeExploitation.Windows, 1000, "RTX 4060", "650W");
        OrdinateurPortable p1 = new OrdinateurPortable(3, "Book 14", "LP-003", 1800, 14.0,
                "Ryzen 5", 16, SystemeExploitation.Ubuntu, 512, "Intégrée", 5000);
        ComposantStockage s1 = new ComposantStockage(4, "SSD 256", "ST-004", 90, 256);
        ComposantStockage s2 = new ComposantStockage(5, "SSD 1To", "ST-005", 250, 1000);
        Peripheriques k1 = new Peripheriques(6, "Clavier", "PE-006", 60, "Bluetooth", "sans fil");

        System.out.println(m1);
        System.out.println(d1);
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(k1);

        System.out.println("Garantie mobile : " + m1.garantirAppareil());
        System.out.println("Garantie bureau : " + d1.garantirAppareil());
        System.out.println("Garantie portable : " + p1.garantirAppareil());
        System.out.println("Garantie SSD 256 : " + s1.garantirAppareil());
        System.out.println("Garantie SSD 1To : " + s2.garantirAppareil());
    }
}