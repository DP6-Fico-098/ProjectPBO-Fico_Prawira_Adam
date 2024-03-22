public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Fico", 19, "221401098", "Ilmu Komputer", 3.5,3.7, 3.9);
        Mahasiswa mahasiswa2 = new Mahasiswa("Prawira", 19, "22140113", "Ilmu Komputer", 3.6, 3.8, 3.65);
        Mahasiswa mahasiswa3 = new Mahasiswa("Adam", 19, "221401082", "Ilmu Komputer", 4.0, 3.78, 3.5);

        mahasiswa1.info();
        mahasiswa1.jumlahIPK();
        System.out.println();
        mahasiswa2.info();
        mahasiswa2.jumlahIPK();
        System.out.println();
        mahasiswa3.info();
        mahasiswa3.jumlahIPK();
        System.out.println();

    }
}