package Komputer.java;

public class Pc extends Komputer implements Rekomendasi {
    private int ukuranMonitor; //property

    public Pc(String merk,int kecProsesor , int sizeMemory, String jnsProsesor) { //contructor
        super(merk,kecProsesor ,sizeMemory , jnsProsesor);
    }

    public int getUkuranMonitor() {//getter
        return ukuranMonitor;
    }

    public void setUkuranMonitor(int ukuranMonitor) { //setter
        this.ukuranMonitor = ukuranMonitor;
    }

    @Override
    public void tampilData() { //override dr class abstract
        System.out.println("============================PC===========================");
        super.tampilData();

    }

    @Override
    public void DisplayRekom() {
        tampilData();
        setUkuranMonitor(24);
        System.out.println("Ukuran monitor       : "+getUkuranMonitor());
        System.out.println("Rekomendasi Aplikasi : \n" + aplikasi);
        dekorasi();
    }
}
