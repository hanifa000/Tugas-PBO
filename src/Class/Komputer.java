package Class;

public class Komputer {
    public String merk, jnsProsesor;
    private int kecProsesor, sizeMemory;

    public Komputer(){}

    static void decor() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
        System.out.println("Merk                : "+merk);
        System.out.println("Kecepatan Prosesor  : "+kecProsesor+" Ghz");
        System.out.println("Ukuran Memory       : "+sizeMemory+" GB");
        System.out.println("Jenis prosesor      : "+jnsProsesor);
    }
}