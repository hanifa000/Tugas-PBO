package Komputer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------Data Laptop-----------------------\n");

        Mac m = new Mac("Macbook Pro", 2, 8, "Intel i9", "Lithium-Polymer", "Chip");
        m.tampilMac();

//        Windows w = new Windows("Lenovo Legion Y920", 4, 8,
//                "Intel Core i7-11370H", "52.5 Wh Li-ion Polymer");
//        w.tampilWindows();
        Windows win = new Windows("HP Pavilion Gaming ", 4, 8,
                "Intel Core i7-7820HK", "Li-Polymer 90Wh", "Dilengkapi Mekanikal Keyboard");
        win.tampilWindows();

        Pc p = new Pc("Asus", 5, 16, "Intel Core i7");
        p.tampilData();
        p.setUkuranMonitor(24);
        System.out.println("Ukuran monitor      : "+p.getUkuranMonitor());

        // membuat variabel dan scanner
        boolean running = true;
        String jawab;
        Scanner scn = new Scanner(System.in);

        while( running ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [0(ya)/1(tidak)]> ");
            jawab = scn.nextLine();

            // cek jawabannya, kalau ya maka berhenti mengulang
            if( jawab.equalsIgnoreCase(String.valueOf(0)) ){
                running = false;
            }
            else{
                System.out.println("kenapa? program telah selesai:)");
                System.out.println("Oke saya akan tanya kembali\n");
            }
        }
    }
}