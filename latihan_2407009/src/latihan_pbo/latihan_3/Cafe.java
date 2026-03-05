package latihan_pbo.latihan_3;

public class Cafe {
    // Atribut sesuai deskripsi
    private String nama;
    private String bahan1;
    private String bahan2;
    private String bahan3;
    
    // Constructor
    public Cafe(String nama, String bahan1, String bahan2, String bahan3) {
        this.nama = nama;
        this.bahan1 = bahan1;
        this.bahan2 = bahan2;
        this.bahan3 = bahan3;
    }
    
    // Method untuk membuat kopi berdasarkan jenis
    public void buatKopi(String jenisKopi) {
        System.out.println("=== MEMBUAT KOPI ===");
        System.out.println("Cafe: " + nama);
        System.out.println("Jenis Kopi: " + jenisKopi);
        System.out.println("Bahan-bahan yang tersedia:");
        System.out.println("- " + bahan1);
        System.out.println("- " + bahan2);
        System.out.println("- " + bahan3);
        
        // Kondisi untuk takaran kopi berdasarkan deskripsi
        if (jenisKopi.equalsIgnoreCase("mochaccino") || jenisKopi.equalsIgnoreCase("moccachino")) {
            System.out.println("\nTakaran untuk Mochaccino:");
            System.out.println("- 1 slot Espresso");
            System.out.println("- 2 slot Susu");
            System.out.println("- 0.5 slot Coklat (half foam)");
        } 
        else if (jenisKopi.equalsIgnoreCase("espresso")) {
            System.out.println("\nTakaran untuk Espresso (2,3,4):");
            System.out.println("- 2 slot Espresso");
            System.out.println("- 3 slot Air");
            System.out.println("- 4 slot Gula");
        }
        else if (jenisKopi.equalsIgnoreCase("latte")) {
            System.out.println("\nTakaran untuk Latte:");
            System.out.println("- 1 slot Espresso");
            System.out.println("- 2 slot Susu");
            System.out.println("- 1 slot Foam");
        }
        else if (jenisKopi.equalsIgnoreCase("cappuccino")) {
            System.out.println("\nTakaran untuk Cappuccino:");
            System.out.println("- 1 slot Espresso");
            System.out.println("- 1 slot Susu");
            System.out.println("- 2 slot Foam");
        }
        else if (jenisKopi.equalsIgnoreCase("americano")) {
            System.out.println("\nTakaran untuk Americano:");
            System.out.println("- 1 slot Espresso");
            System.out.println("- 3 slot Air");
            System.out.println("- 0 slot Gula");
        }
        else {
            System.out.println("\nJenis kopi tidak dikenal. Menggunakan takaran default:");
            System.out.println("- 1 slot " + bahan1);
            System.out.println("- 1 slot " + bahan2);
            System.out.println("- 1 slot " + bahan3);
        }
        
        System.out.println("========================\n");
    }
    
    // Method untuk menampilkan informasi cafe
    public void tampilkanInfo() {
        System.out.println("=== INFORMASI CAFE ===");
        System.out.println("Nama Cafe: " + nama);
        System.out.println("Bahan Utama:");
        System.out.println("1. " + bahan1);
        System.out.println("2. " + bahan2);
        System.out.println("3. " + bahan3);
        System.out.println("======================\n");
    }
    
    // Method tambahan untuk menampilkan resep semua kopi
    public void tampilkanSemuaResep() {
        System.out.println("=== DAFTAR RESEP KOPI ===");
        System.out.println("1. Mochaccino: 1 Espresso, 2 Susu, 0.5 Coklat");
        System.out.println("2. Espresso (2,3,4): 2 Espresso, 3 Air, 4 Gula");
        System.out.println("3. Latte: 1 Espresso, 2 Susu, 1 Foam");
        System.out.println("4. Cappuccino: 1 Espresso, 1 Susu, 2 Foam");
        System.out.println("5. Americano: 1 Espresso, 3 Air");
        System.out.println("========================\n");
    }
    
    // Getter dan Setter
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getBahan1() {
        return bahan1;
    }
    
    public void setBahan1(String bahan1) {
        this.bahan1 = bahan1;
    }
    
    public String getBahan2() {
        return bahan2;
    }
    
    public void setBahan2(String bahan2) {
        this.bahan2 = bahan2;
    }
    
    public String getBahan3() {
        return bahan3;
    }
    
    public void setBahan3(String bahan3) {
        this.bahan3 = bahan3;
    }
    
    // Main method untuk testing
    public static void main(String[] args) {
        // Membuat objek Cafe
        Cafe cafeKu = new Cafe("Kopikan", "Espresso", "Susu", "Coklat");
        
        // Menampilkan informasi cafe
        cafeKu.tampilkanInfo();
        
        // Menampilkan semua resep
        cafeKu.tampilkanSemuaResep();
        
        // Membuat berbagai jenis kopi
        cafeKu.buatKopi("mochaccino");  // menggunakan ejaan yang benar
        cafeKu.buatKopi("espresso");
        cafeKu.buatKopi("latte");
        cafeKu.buatKopi("cappuccino");
        cafeKu.buatKopi("americano");
        
        // Contoh dengan ejaan alternatif
        cafeKu.buatKopi("moccachino");  // ejaan dari soal
    }
}