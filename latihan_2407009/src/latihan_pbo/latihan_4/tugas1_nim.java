package latihan_pbo.latihan_4;

import java.util.Scanner;

/**
 * ===================================================
 * KALKULATOR BANGUN DATAR
 * BERDASARKAN CLASS DIAGRAM
 * ===================================================
 * 
 * NAMA : [NALA]
 * NIM  : [2407009]
 * ===================================================
 */

// ============= CLASS BANGUN DATAR =============
class BangunDatar {
    // Atribut protected (#)
    protected double Luas;
    protected double Keliling;
    
    // Method public (+)
    public double getLuas() {
        return Luas;
    }
    
    public double getKeliling() {
        return Keliling;
    }
}

// ============= CLASS PERSEGI PANJANG =============
class PersegiPanjang extends BangunDatar {
    // Atribut private (-)
    private double Panjang;
    private double Lebar;
    
    // Method public (+)
    public void setData(double p, double l) {
        this.Panjang = p;
        this.Lebar = l;
    }
    
    public void hitung() {
        this.Luas = Panjang * Lebar;
        this.Keliling = 2 * (Panjang + Lebar);
    }
    
    public void tampilDiagram() {
        System.out.println("\n=== PERSEGI PANJANG ===");
        System.out.println("Panjang : " + Panjang);
        System.out.println("Lebar   : " + Lebar);
        System.out.println("Luas    : " + Luas);
        System.out.println("Keliling: " + Keliling);
    }
}

// ============= CLASS SEGITIGA =============
class Segitiga extends BangunDatar {
    // Atribut private (-)
    private double alas;
    private double tinggi;
    private double a;
    private double b;
    private double c;
    
    // Method public (+)
    public void setData(double a, double t, double s1, double s2, double s3) {
        this.alas = a;
        this.tinggi = t;
        this.a = s1;
        this.b = s2;
        this.c = s3;
    }
    
    public void hitung() {
        this.Luas = 0.5 * alas * tinggi;
        this.Keliling = a + b + c;
    }
    
    public void tampilDiagram() {
        System.out.println("\n=== SEGITIGA ===");
        System.out.println("Alas   : " + alas);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Sisi A : " + a);
        System.out.println("Sisi B : " + b);
        System.out.println("Sisi C : " + c);
        System.out.println("Luas   : " + Luas);
        System.out.println("Keliling: " + Keliling);
    }
}

// ============= CLASS LINGKARAN =============
class Lingkaran extends BangunDatar {
    // Atribut private (-)
    private double r;
    private final double PHI = 3.14;
    
    // Method public (+)
    public void setLari(double r) {
        this.r = r;
    }
    
    public void hitung() {
        this.Luas = PHI * r * r;
        this.Keliling = 2 * PHI * r;
    }
    
    public void tampilDiagram() {
        System.out.println("\n=== LINGKARAN ===");
        System.out.println("Jari-jari: " + r);
        System.out.println("Luas     : " + Luas);
        System.out.println("Keliling : " + Keliling);
    }
}

// ============= CLASS UTAMA =============
public class tugas1_nim {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        
        System.out.println("\n======================================");
        System.out.println("   KALKULATOR BANGUN DATAR");
        System.out.println("======================================");
        System.out.println("NIM : [ISI NIM ANDA]");
        System.out.println("======================================");
        
        // TAMPILKAN CLASS DIAGRAM SEDERHANA
        System.out.println("\n=== CLASS DIAGRAM ===");
        System.out.println("+-------------------+");
        System.out.println("|   BangunDatar     |");
        System.out.println("+-------------------+");
        System.out.println("| # Luas: double    |");
        System.out.println("| # Keliling: double|");
        System.out.println("+-------------------+");
        System.out.println("| + getLuas()       |");
        System.out.println("| + getKeliling()   |");
        System.out.println("+-------------------+");
        System.out.println("         ^");
        System.out.println("         |");
        System.out.println("---------+----------+----------");
        System.out.println("|                   |         |");
        System.out.println("+-------------------+ +-------------------+ +-------------------+");
        System.out.println("|  PersegiPanjang   | |    Segitiga       | |    Lingkaran      |");
        System.out.println("+-------------------+ +-------------------+ +-------------------+");
        System.out.println("| - Panjang: double | | - alas: double    | | - r: double       |");
        System.out.println("| - Lebar: double   | | - tinggi: double  | +-------------------+");
        System.out.println("+-------------------+ | - a: double       | | + setLari()       |");
        System.out.println("| + setData()       | | - b: double       | | + hitung()        |");
        System.out.println("| + hitung()        | | - c: double       | | + tampilDiagram() |");
        System.out.println("| + tampilDiagram() | +-------------------+ +-------------------+");
        System.out.println("+-------------------+ | + setData()       |");
        System.out.println("                      | + hitung()        |");
        System.out.println("                      | + tampilDiagram() |");
        System.out.println("                      +-------------------+");
        System.out.println("\nKeterangan:");
        System.out.println("# = Protected");
        System.out.println("- = Private");
        System.out.println("+ = Public");
        System.out.println("======================================");
        
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Persegi Panjang");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    // PERSEGI PANJANG
                    System.out.println("\n-- PERSEGI PANJANG --");
                    System.out.print("Masukkan Panjang: ");
                    double p = input.nextDouble();
                    System.out.print("Masukkan Lebar: ");
                    double l = input.nextDouble();
                    
                    PersegiPanjang pp = new PersegiPanjang();
                    pp.setData(p, l);
                    pp.hitung();
                    pp.tampilDiagram();
                    break;
                    
                case 2:
                    // SEGITIGA
                    System.out.println("\n-- SEGITIGA --");
                    System.out.print("Masukkan alas: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = input.nextDouble();
                    System.out.print("Masukkan sisi A: ");
                    double sA = input.nextDouble();
                    System.out.print("Masukkan sisi B: ");
                    double sB = input.nextDouble();
                    System.out.print("Masukkan sisi C: ");
                    double sC = input.nextDouble();
                    
                    Segitiga s = new Segitiga();
                    s.setData(alas, tinggi, sA, sB, sC);
                    s.hitung();
                    s.tampilDiagram();
                    break;
                    
                case 3:
                    // LINGKARAN
                    System.out.println("\n-- LINGKARAN --");
                    System.out.print("Masukkan jari-jari: ");
                    double r = input.nextDouble();
                    
                    Lingkaran lkr = new Lingkaran();
                    lkr.setLari(r);
                    lkr.hitung();
                    lkr.tampilDiagram();
                    break;
                    
                case 4:
                    System.out.println("\nTerima kasih!");
                    break;
                    
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
            
        } while (pilihan != 4);
        
        input.close();
    }
}