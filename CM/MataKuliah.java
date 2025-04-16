package CM;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(String kodeMk, String namaMk, int Sks) {
        kodeMK = kodeMk;
        namaMK = namaMk;
        sks = Sks;
    }

    void tampilMataKuliah() {
        System.out.println("Kode Matkul: " + kodeMK);
        System.out.println("Nama Matkul: " + namaMK);
        System.out.println("Jumlah sks: " + sks);
    }
}
