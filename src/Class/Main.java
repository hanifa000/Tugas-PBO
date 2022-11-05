import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("******************Data Laptop******************");
        Komputer kom = new Komputer();
        kom.decor();

        Mac m = new Mac ("Macbook Pro", 2, 8, "Intel i9", "Lithium-Polymer", "Chip");
        m.tampilMac();

        kom.decor();
        Windows w = new Windows("Lenovo Legion Y920", 4, 8,
                "Intel Core i7-11370H", "52.5 Wh Li-ion Polymer");
        w.tampilWindows();
        Windows win = new Windows("HP Pavilion Gaming ", 4, 8,
                "Intel Core i7-7820HK", "Li-Polymer 90Wh", "Dilengkapi Mekanikal Keyboard");
        w.tampilWindows();

        kom.decor();
        Pc p = new Pc("Asus", 5, 16, "Intel Core i7");
        //p.setUkuranMonitor(24);
        p.tampilPc();

        kom.decor();
    }
}