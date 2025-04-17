package CM;

public class DaftarMahasiswa {
    Penilaian[] listMhs;
    int idx;

    DaftarMahasiswa(int jumMhs) {
        listMhs = new Penilaian[jumMhs];
        idx=0;
    }

    void tambah(Penilaian mhs) {
        if (idx < listMhs.length) {
            listMhs[idx] = mhs;
            idx++;
        } else {
            System.out.println("SEK NKO");
        }
    }

    void tampilMahasiswa() {
        for (Penilaian mhs : listMhs) {
            mhs.mahasiswa.tampilInformasi();
            System.out.println("-------------");
        }
    }

    void tampilMataKuliah() {
        for (Penilaian mhs : listMhs) {
            mhs.mataKuliah.tampilMataKuliah();
            System.out.println("-------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i; j++) {
                if(listMhs[j].nilaiAkhir > listMhs [j - 1].nilaiAkhir) {
                    Penilaian tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void tampilkanDataPenilaian() { //hgduagdcuahscd
        System.out.println("Tet");    
        System.out.println("woe");
    }
}
