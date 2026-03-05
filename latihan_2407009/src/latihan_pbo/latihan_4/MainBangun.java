package latihan_pbo.latihan_4;

// Kelas BangunDatar sebagai parent class
class BangunDatar {
    protected String nama;
    
    public BangunDatar() {
        this.nama = "Bangun Datar";
    }
    
    public BangunDatar(String nama) {
        this.nama = nama;
    }
    
    public double hitungLuas() {
        return 0;
    }
    
    public double hitungKeliling() {
        return 0;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
    
    public String getNama() {
        return nama;
    }
}

// Kelas Persegi
class Persegi extends BangunDatar {
    private double sisi;
    
    public Persegi() {
        super("Persegi");
        this.sisi = 0;
    }
    
    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Kelas PersegiPanjang
class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang() {
        super("Persegi Panjang");
        this.panjang = 0;
        this.lebar = 0;
    }
    
    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

// Kelas Segitiga
class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public Segitiga() {
        super("Segitiga");
        this.alas = 0;
        this.tinggi = 0;
    }
    
    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas() {
        return (alas * tinggi) / 2;
    }
    
    @Override
    public double hitungKeliling() {
        return 3 * alas; // Asumsi segitiga sama sisi
    }
}

// Kelas Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari;
    
    public Lingkaran() {
        super("Lingkaran");
        this.jariJari = 0;
    }
    
    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }
    
    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

// Kelas Main
public class MainBangun {
    public static void main(String[] args) {
        System.out.println("PROGRAM BANGUN DATAR");
        System.out.println("====================\n");
        
        try {
            // Membuat objek Persegi
            Persegi persegi = new Persegi(5);
            System.out.println("PERSEGI");
            System.out.println("Sisi: 5");
            System.out.println("Luas: " + persegi.hitungLuas());
            System.out.println("Keliling: " + persegi.hitungKeliling());
            
            System.out.println("\nPERSEGI PANJANG");
            // Membuat objek Persegi Panjang
            PersegiPanjang persegiPanjang = new PersegiPanjang(8, 4);
            System.out.println("Panjang: 8");
            System.out.println("Lebar: 4");
            System.out.println("Luas: " + persegiPanjang.hitungLuas());
            System.out.println("Keliling: " + persegiPanjang.hitungKeliling());
            
            System.out.println("\nSEGITIGA");
            // Membuat objek Segitiga
            Segitiga segitiga = new Segitiga(6, 4);
            System.out.println("Alas: 6");
            System.out.println("Tinggi: 4");
            System.out.println("Luas: " + segitiga.hitungLuas());
            System.out.println("Keliling: " + segitiga.hitungKeliling());
            
            System.out.println("\nLINGKARAN");
            // Membuat objek Lingkaran
            Lingkaran lingkaran = new Lingkaran(7);
            System.out.println("Jari-jari: 7");
            System.out.println("Luas: " + lingkaran.hitungLuas());
            System.out.println("Keliling: " + lingkaran.hitungKeliling());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}