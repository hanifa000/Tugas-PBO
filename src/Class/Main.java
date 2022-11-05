package Class;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("******************Data Class.Laptop******************");
        Komputer kom = new Komputer();
        kom.decor();

        Mac m = new Mac("Macbook Pro", 2, 8, "Intel i9", "Lithium-Polymer", "Chip");
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
        p.tampilPc();
        p.setUkuranMonitor(24);
        System.out.println("Ukuran monitor      : "+p.getUkuranMonitor());
        kom.decor();

        // membuat variabel dan scanner
        boolean running = true;
        int counter = 0;
        String jawab;
        Scanner scn = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scn.nextLine();

            // cek jawabnnya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase("ya") ){
                running = false;
            }

            counter++;
        }

        System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali");
    }
}