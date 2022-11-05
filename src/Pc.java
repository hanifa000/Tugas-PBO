public class Pc extends Komputer {
    private int ukuranMonitor;

    public Pc(){}

    public int getUkuranMonitor() {
        return ukuranMonitor;
    }

    public void setUkuranMonitor(int ukuranMonitor) {
        this.ukuranMonitor = ukuranMonitor;
    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
    }
    public void tampilPc(){
        System.out.println("=================PC================");
        super.tampilData();
        setUkuranMonitor(24);
        System.out.println("Ukuran monitor      : "+getUkuranMonitor());
    }

}