package Komputer.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------Data Laptop-----------------------\n");

        Mac m = new Mac("Macbook ", 2, 8, "Intel i9", "Lithium-Polymer", "Chip");
        m.DisplayRekom();

//        Windows w = new Windows("Lenovo Legion Y920", 4, 8,
//                "Intel Core i7-11370H", "52.5 Wh Li-ion Polymer");
//        w.tampilWindows();
        Windows win = new Windows("HP ", 4, 8,
                "Intel Core i7", "Li-Polymer 90Wh", "Dilengkapi Mekanikal Keyboard");
        win.DisplayRekom();

        Pc p = new Pc("Asus", 5, 16, "Intel Core i7");
        p.setUkuranMonitor(24);
        System.out.println("Ukuran monitor      : "+p.getUkuranMonitor());
        p.DisplayRekom();

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
                System.out.println("kenapa? program hanya statis dan selesai:)");
                System.out.println("Oke saya akan tanya kembali\n");
            }
        }
    }
}