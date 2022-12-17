package Komputer.java;

public abstract class  Komputer { //class abstract
    public String merk, jnsProsesor; //property
    private int kecProsesor, sizeMemory; //property

    //opsi dekor program
    static void dekorasi() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){ //constructor
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
//        dekorasi();
        System.out.println("Merk                 : "+merk);
        System.out.println("Kecepatan Prosesor   : "+kecProsesor+" Ghz");
        System.out.println("Ukuran Memory        : "+sizeMemory+" GB");
        System.out.println("Jenis prosesor       : "+jnsProsesor);
    }
}