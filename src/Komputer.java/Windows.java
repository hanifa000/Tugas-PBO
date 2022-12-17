package Komputer.java;

public class Windows extends Laptop implements Rekomendasi{
    public String fitur; //property

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){ //constructor
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
    }

    public void tampilWindows(){ //show output
        System.out.println("===========================Windows==========================");
        super.tampilLaptop();
        System.out.println("Fitur                : "+fitur);

    }

    @Override
    public void DisplayRekom() {
        tampilWindows();
        System.out.println("Rekomendasi Aplikasi : \n" + aplikasi);
        dekorasi();
    }
}