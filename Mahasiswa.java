public class Mahasiswa {
    String nama;
    int umur;
    String NIM;
    String jurusan;
    double IP1;
    double IP2;
    double IP3;

    Mahasiswa(String nama, int umur, String NIM, String jurusan, double IP1, double IP2, double IP3) {
        this.nama = nama;
        this.umur = umur;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.IP1 = IP1;
        this.IP2 = IP2;
        this.IP3 = IP3;

    }

    void info() {
        System.out.println("Hai nama saya: " + nama);
        System.out.println("Saya sekarang berumur: " + umur + " Tahun");
        System.out.println("NIM saya: " + NIM);
        System.out.println("Saya adalah mahasiswa: " + jurusan);
    }

    public void jumlahIPK(){
        double hasilIPK = (IP1 + IP2 + IP3) / 3;
        System.out.println("Hasil IPK saya selama 3 semester adalah: " + hasilIPK);
    }

    public void jumlahIPK(double semesterTambah){
        double hasilIPK = (IP1 + IP2 + IP3 + semesterTambah) / 4;
        System.out.println("Hasil IPK saya selama 4 adalah: " + hasilIPK);
    }

    public void jumlahIPK(double semesterTambah, double IP5){
        double hasilIPK = (IP1 + IP2 + IP3 + semesterTambah + IP5) / 5;
        System.out.println("Hasil IPK saya dengan lima semester adalah: " + hasilIPK);
    }
}