package latihan_pbo.latihan_1;

class Cafe{
    String nama;
    String alamat;

    // constructor
    Cafe (String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("nama cafenya adalah : " + nama);
        System.out.println("alamatnya di : " + alamat);
    }

    // method
    void buka(){
        System.out.println("===================");
        System.out.println("Cafe" + nama + "Sudah Buka");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

  
}
public class Main {
    public static void main(String[] args) {


        // System.out.println("=======CAFE 1=======");
        Cafe cafe1 = new Cafe("Kenangan", "Indramayu");
        // cafe1.nama = "Kopi Kenangan";
        // cafe1.alamat = "Indramayu";
        // System.out.println("Nama Cafe :" + cafe1.nama);
        // System.out.println("Nama Cafe :" + cafe1.alamat);

       
        // System.out.println("=======CAFE 2=======");
        Cafe cafe2 = new Cafe("Tomoro", "Indramayu");
        // cafe2.nama = "Kopi Tomoro";
        // cafe2.alamat = "Indramayu";
        // System.out.println("Nama Cafe :" + cafe2.nama);
        // System.out.println("Nama Cafe :" + cafe2.alamat);

       

        // System.out.println("=======CAFE 3=======");
        Cafe cafe3 = new Cafe("Fore", "Indramayu");
        // cafe3.nama = "Kopi Fore";
        // cafe3.alamat = "Indramayu";
        // System.out.println("Nama Cafe :" + cafe3.nama);
        // System.out.println("Nama Cafe :" + cafe3.alamat);


        Cafe Cafe2 = new Cafe("Tomoro", "Indramayu");
        cafe3.setNama("Janji Jiwa");
        cafe2.buka();
    }
}