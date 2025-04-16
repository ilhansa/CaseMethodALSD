package CM;

public class DaftarMahasiswa {
    Mahasiswa[] listMhs;
    int idx;

    DaftarMahasiswa(int jumMhs) {
        listMhs = new Mahasiswa[jumMhs];
        idx=0;
    }

    void tambah(Mahasiswa mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("SEK NKO");
        }
    }

    void tampil() {
        for (Mahasiswa mhs : listMhs) {
            mhs.tampilInformasi();
            System.out.println("-------------");
        }
    }
}
