package CM;

public class DaftarMahasiswa {
    Penilaian[] listMhs;
    Mahasiswa[] arrMhs;

    DaftarMahasiswa(Penilaian[] listmhs, Mahasiswa[] arrmhs) {
       listMhs = listmhs;
       arrMhs = arrmhs;
    }

    void tampilMahasiswa() {
        for (Penilaian mhs : listMhs) {
            mhs.mahasiswa.tampilInformasi();
            System.out.println("-------------");
        }
    }

    void bubbleSort() { // descending
        // Hitung nilai akhir semua dulu
        for (int i = 0; i < listMhs.length; i++) {
            listMhs[i].hitungNilaiAkhir();
        }
    
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 0; j < listMhs.length - i - 1; j++) {
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

    void sortByNIM() { // bubble sort ascending
        // sorting berdasarkan nim
        for (int i = 0; i < arrMhs.length - 1; i++) {
            for (int j = 0; j < arrMhs.length - i - 1; j++) {
                if (arrMhs[j].nim.compareTo(arrMhs[j + 1].nim) > 0) {
                    Mahasiswa tmp = arrMhs[j];
                    arrMhs[j] = arrMhs[j + 1];
                    arrMhs[j + 1] = tmp;
                }
            }
        }
    }

    void searchByNIM(String nimDicari) {
        int kiri = 0;
        int kanan = arrMhs.length - 1;
    
        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            String nimTengah = listMhs[tengah].mahasiswa.nim;
    
            int banding = nimTengah.compareTo(nimDicari);
    
            if (banding == 0) {
                System.out.println("Mahasiswa ditemukan:");
                System.out.println("NIM   : " + arrMhs[tengah].nim);
                System.out.println("Nama  : " + arrMhs[tengah].nama);
                System.out.println("Prodi : " + arrMhs[tengah].prodi);
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
