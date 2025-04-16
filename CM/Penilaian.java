package CM;

public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUts;
    double nilaiUas;
    double nilaiAkhir;

    Penilaian(
        Mahasiswa Mahasiswa, MataKuliah MataKuliah,
        double NilaiTugas, double NilaiUts,
        double NilaiUas) 
    {
        mahasiswa = Mahasiswa;
        mataKuliah = MataKuliah;
        nilaiTugas = NilaiTugas;
        nilaiUts = NilaiUts;
        nilaiUas = NilaiUas;
    }

    void hitungNilaiAkhir() {
        double bobotNilaiTugas = 0.3; // 30%
        double bobotNilaiUts = 0.3; // 30%
        double bobotNilaiUas = 0.4; // 40%

        nilaiAkhir = 
            (nilaiTugas * bobotNilaiTugas) + (nilaiUts * bobotNilaiUts)
             + (nilaiUas * bobotNilaiUas);
        
        System.out.println("Nilai akhir: " + nilaiAkhir);
    }
}
