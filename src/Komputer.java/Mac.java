package Komputer.java;

public class Mac extends Laptop implements Rekomendasi{
    private String security;

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security=security;
    }

    public final void tampilMac(){ //final
        System.out.println("============================Mac===========================");
        super.tampilLaptop();
        System.out.println("Security             : "+security);

    }

    @Override
    public void DisplayRekom() {
        tampilMac();
        System.out.println("Rekomendasi Aplikasi : \n" + aplikasi);
        dekorasi();
    }
}