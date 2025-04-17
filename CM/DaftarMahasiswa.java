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

    void bubbleSort() { // Mengurutkan secara descending (terbesar ke terkecil)
        // Hitung nilai akhir semua dulu
        for (int i = 0; i < idx; i++) {
            listMhs[i].hitungNilaiAkhir();
        }
    
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].nilaiAkhir < listMhs[j + 1].nilaiAkhir) {
                    // Tukar posisi jika nilai akhir lebih kecil dari berikutnya
                    Penilaian tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }
    

    void tampilkanDataPenilaian() { 
        System.out.println("Data penilaian");
        for (int i = 0; i < listMhs.length; i++) {
            System.out.print(listMhs[i].mahasiswa.nama
             + " | " + listMhs[i].mataKuliah.namaMK + " | ");
            listMhs[i].hitungNilaiAkhir();
            System.out.println();
        }
    }

    void sortByNIM() { // ascending
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listMhs[j].mahasiswa.nim.compareTo(listMhs[j + 1].mahasiswa.nim) > 0) {
                    Penilaian tmp = listMhs[j];
                    listMhs[j] = listMhs[j + 1];
                    listMhs[j + 1] = tmp;
                }
            }
        }
    }

    void searchByNIM(String nimDicari) {
        int kiri = 0;
        int kanan = idx - 1;
    
        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            String nimTengah = listMhs[tengah].mahasiswa.nim;
    
            int banding = nimTengah.compareTo(nimDicari);
    
            if (banding == 0) {
                System.out.println("Mahasiswa ditemukan:");
                System.out.println("NIM   : " + listMhs[tengah].mahasiswa.nim);
                System.out.println("Nama  : " + listMhs[tengah].mahasiswa.nama);
                System.out.println("Prodi : " + listMhs[tengah].mahasiswa.prodi);
                System.out.println("Mata Kuliah : " + listMhs[tengah].mataKuliah.namaMK);
                listMhs[tengah].hitungNilaiAkhir(); // tampilkan nilai akhir juga kalau perlu
                return;
            } else if (banding < 0) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
        System.out.println("Mahasiswa dengan NIM " + nimDicari + " tidak ditemukan.");
    }    
}
