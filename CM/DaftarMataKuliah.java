package CM;

public class DaftarMataKuliah {
    MataKuliah[] listMk;
    int idx;
    
    DaftarMataKuliah(int jumMk) {
        listMk = new MataKuliah[jumMk]; // pakai jumMk, bukan idx
        idx = 0;
    }

    void tambah(MataKuliah mk) {
        if (idx < listMk.length) {
            listMk[idx] = mk;
            idx++;
        } else {
            System.out.println("SEK NKO");
        }
    }

    void tampilDataMataKuliah() {
        for (int i = 0; i < idx; i++) {
            listMk[i].tampilMataKuliah();
        }
    }
}
