package Komputer.java;

public class Laptop extends Komputer{ //class anak/warisan
    public String jnsBatrei; //property

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){  //constructor
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei=jnsBatrei;
    }
    public void tampilLaptop(){ //show output
        super.tampilData();
        System.out.println("Jenis baterai       : "+jnsBatrei);
    }

}