package CM;

public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String Nim, String Nama, String Prodi) {
        nim = Nim;
        nama = Nama;
        prodi = Prodi;
    }

    void tampilInformasi() {
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
