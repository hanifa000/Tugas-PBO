package Komputer.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------Data Laptop-----------------------\n");
        //class mac
        Mac m = new Mac("Macbook ", 2, 8, "Intel i9", "Lithium-Polymer", "Chip");
        m.DisplayRekom();
        //class windows
        Windows win = new Windows("HP ", 4, 8, "Intel Core i7", "Li-Polymer 90Wh", "Dilengkapi Mekanikal Keyboard");
        win.DisplayRekom();
        //class pc
        Pc p = new Pc("Asus", 5, 16, "Intel Core i7");
        p.DisplayRekom();
        //membuat file i/o
       File file = new File("data.txt");
        try {
            PrintWriter create = new PrintWriter(file);
            //variabel dan scanner
            boolean enter = true;
            String pilih;
            Scanner plh = new Scanner(System.in);
            while (enter){
                System.out.println("Jenis Komputer apa yang anda inginkan (Pc/Mac/Windows)?");
                System.out.println(" - Pc\n - Mac\n - Windows");
                System.out.print("Enter : ");
                pilih = plh.nextLine();
                if (pilih.equalsIgnoreCase(String.valueOf("Pc"))){
                    create.println("\n============================PC===========================\n" +
                            " Merk                 : Asus\n Kecepatan Prosesor   : 5 Ghz\n Ukuran Memory        : 16 GB\n Jenis prosesor       : Intel Core i7\n Ukuran monitor       : 24\n Rekomendasi Software : \n" +
                            " - MS.Word\n - MS.Excel\n - MS.PowerPoint\n - Microsoft Office\n - Adobe\n - Spotify\n - Netflix\n - Google Drive\n - Zoom\n - Google Chrome / Safari\n" +
                            "++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    create.close();
                    System.out.println("tercetak di file data.txt");
                    enter = false;
                } else if (pilih.equalsIgnoreCase(String.valueOf("Mac"))) {
                    create.println("\n============================Mac===========================\n" +
                            " Merk                 : Macbook \n Kecepatan Prosesor   : 2 Ghz\n Ukuran Memory        : 8 GB\n Jenis prosesor       : Intel i9\n Jenis baterai        : Lithium-Polymer\n Security             : Chip\n Rekomendasi Software : \n" +
                            " - MS.Word\n - MS.Excel\n - MS.PowerPoint\n - Microsoft Office\n - Adobe\n - Spotify\n - Netflix\n - Google Drive\n - Zoom\n - Google Chrome / Safari\n" +
                            "++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    create.close();
                    enter = false;
                } else if (pilih.equalsIgnoreCase(String.valueOf("Windows"))) {
                    create.println("\n===========================Windows==========================\n" +
                            " Merk                 : HP \n Kecepatan Prosesor   : 4 Ghz\n Ukuran Memory        : 8 GB\n Jenis prosesor       : Intel Core i7\n Jenis baterai        : Li-Polymer 90Wh\n Fitur                : Dilengkapi Mekanikal Keyboard\n Rekomendasi Software : \n" +
                            " - MS.Word\n - MS.Excel\n - MS.PowerPoint\n - Microsoft Office\n - Adobe\n - Spotify\n - Netflix\n - Google Drive\n - Zoom\n - Google Chrome / Safari\n" +
                            "++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    create.close();
                    System.out.println("tercetak di file data.txt");
                    enter = false;
                } else {
                    System.out.println("pilihan tidak tersedia, silahkan pilih lagi!");
                    enter = true;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // membuat variabel dan scanner
        boolean run = true;
        int jawab;
        Scanner scn = new Scanner(System.in);

        while( run ) {
            System.out.println("\nApakah anda ingin keluar?");
            System.out.print("Jawab [0(ya)/1(tidak)]> ");
            jawab = scn.nextInt();

            // cek jawabannya, kalau ya maka berhenti mengulang
            if( jawab == 0){
                run = false;
            } else if(jawab == 1){
                System.out.println("kenapa? program telah selesai:)\n");
                System.out.println("Oke saya akan tanya kembali");
            } else{
                System.out.println("Jawaban tidak sesuai pilihan hanya 0 = tidak & 1 = ya!");
                run = true;
            }
        }
    }
}