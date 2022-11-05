package Class;

public class Windows extends Laptop{
    public String fitur;

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
    }

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
        System.out.println("Fitur               : "+fitur);
    }

    public void tampilWindows(){
        System.out.println("=================Class.Laptop Class.Windows================");
        super.tampilLaptop();

    }
}