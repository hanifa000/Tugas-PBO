package Class;

public class Mac extends Laptop{
    private String security;


    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String security){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.security=security;
    }


    public final void tampilMac(){
        System.out.println("=================Class.Laptop Class.Mac================");
        super.tampilLaptop();
        System.out.println("Security            : "+security);
    }
}