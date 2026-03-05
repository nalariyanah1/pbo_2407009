package latihan_pbo.latihan_4;

class BangunDatar2 {
    protected String nama;
    protected String warna;
    
    // Constructor
    public BangunDatar2() {
        this.nama = "Bangun Datar";
        this.warna = "Putih";
    }
    
    public BangunDatar2(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }
    
    // Method yang akan di-override
    public double hitungLuas() {
        return 0;
    }
    
    public double hitungKeliling() {
        return 0;
    }
    
    // Method untuk info
    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
}

// ============== CLASS PERSEGI PANJANG ==============
// Turunan dari BangunDatar2
class PersegiPanjangChild extends BangunDatar2 {
    private double panjang;
    private double lebar;
    
    // Constructor 1: tanpa parameter
    public PersegiPanjangChild() {
        super("Persegi Panjang", "Merah");
        this.panjang = 1;
        this.lebar = 1;
        System.out.println("Objek Persegi Panjang dibuat (default)");
    }
    
    // Constructor 2: dengan parameter panjang dan lebar
    public PersegiPanjangChild(double panjang, double lebar) {
        super("Persegi Panjang", "Biru");
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Objek Persegi Panjang dibuat dengan ukuran");
    }
    
    // Constructor 3: dengan parameter lengkap
    public PersegiPanjangChild(double panjang, double lebar, String warna) {
        super("Persegi Panjang", warna);
        this.panjang = panjang;
        this.lebar = lebar;
        System.out.println("Objek Persegi Panjang dibuat dengan ukuran dan warna");
    }
    
    // Override method hitungLuas
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    // Override method hitungKeliling
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    
    // Method khusus
    public boolean isBujurSangkar() {
        return panjang == lebar;
    }
    
    // Override method tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
        System.out.println("Bentuk bujur sangkar? " + (isBujurSangkar() ? "Ya" : "Bukan"));
    }
    
    // Setter dengan validasi
    public void setPanjang(double panjang) {
        if(panjang > 0) {
            this.panjang = panjang;
        } else {
            System.out.println("Panjang harus positif!");
        }
    }
    
    public void setLebar(double lebar) {
        if(lebar > 0) {
            this.lebar = lebar;
        } else {
            System.out.println("Lebar harus positif!");
        }
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
}

// ============== CLASS BALOK (Turunan dari PersegiPanjangChild) ==============
class BalokChild extends PersegiPanjangChild {
    private double tinggi;
    
    // Constructor
    public BalokChild(double panjang, double lebar, double tinggi, String warna) {
        super(panjang, lebar, warna);
        this.tinggi = tinggi;
        System.out.println("Objek Balok dibuat");
    }
    
    // Method khusus Balok
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
    
    public double hitungLuasPermukaan() {
        return 2 * ((getPanjang() * getLebar()) + (getPanjang() * tinggi) + (getLebar() * tinggi));
    }
    
    // Override tampilInfo
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
    
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}

// ============== CLASS MAIN ==============
public class ProgramPersegiPanjang {
    public static void main(String[] args) {
        
        System.out.println("=================================");
        System.out.println("PROGRAM PEWARISAN PERSEGI PANJANG");
        System.out.println("=================================\n");
        
        // 1. Membuat objek dengan constructor berbeda
        System.out.println("--- CONSTRUCTOR 1 (Default) ---");
        PersegiPanjangChild pp1 = new PersegiPanjangChild();
        pp1.tampilInfo();
        
        System.out.println("\n--- CONSTRUCTOR 2 (Panjang & Lebar) ---");
        PersegiPanjangChild pp2 = new PersegiPanjangChild(10, 5);
        pp2.tampilInfo();
        
        System.out.println("\n--- CONSTRUCTOR 3 (Lengkap) ---");
        PersegiPanjangChild pp3 = new PersegiPanjangChild(7, 7, "Hijau");
        pp3.tampilInfo();
        
        // 2. Demonstrasi method override
        System.out.println("\n--- METHOD OVERRIDE ---");
        BangunDatar2 bd = new PersegiPanjangChild(4, 3, "Kuning");
        System.out.println("Luas (via parent reference): " + bd.hitungLuas());
        System.out.println("Keliling (via parent reference): " + bd.hitungKeliling());
        
        // 3. Demonstrasi method khusus
        System.out.println("\n--- METHOD KHUSUS ---");
        System.out.println("Apakah pp3 bujur sangkar? " + pp3.isBujurSangkar());
        System.out.println("Apakah pp2 bujur sangkar? " + pp2.isBujurSangkar());
        
        // 4. Demonstrasi setter dengan validasi
        System.out.println("\n--- SETTER DENGAN VALIDASI ---");
        System.out.println("Mencoba set panjang = -5:");
        pp2.setPanjang(-5);
        System.out.println("Mencoba set lebar = 8:");
        pp2.setLebar(8);
        System.out.println("Setelah perubahan:");
        System.out.println("Panjang: " + pp2.getPanjang());
        System.out.println("Lebar: " + pp2.getLebar());
        
        // 5. Demonstrasi inheritance bertingkat (Balok)
        System.out.println("\n--- INHERITANCE BERTINGKAT (BALOK) ---");
        BalokChild balok = new BalokChild(5, 3, 4, "Coklat");
        System.out.println();
        balok.tampilInfo();
        
        // 6. Demonstrasi array
        System.out.println("\n--- ARRAY OBJEK PERSEGI PANJANG ---");
        PersegiPanjangChild[] arrayPP = new PersegiPanjangChild[3];
        arrayPP[0] = new PersegiPanjangChild(2, 2);
        arrayPP[1] = new PersegiPanjangChild(5, 3, "Pink");
        arrayPP[2] = new PersegiPanjangChild(4, 4, "Abu-abu");
        
        for(int i = 0; i < arrayPP.length; i++) {
            System.out.println("\nData ke-" + (i+1));
            System.out.println("Luas: " + arrayPP[i].hitungLuas());
            System.out.println("Keliling: " + arrayPP[i].hitungKeliling());
        }
    }
}