package CM;

import java.util.Scanner;

public class SistemAkademis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Mahasiswa mhs1 = new Mahasiswa("2201", "Ali Rahman", "Informatika");
        Mahasiswa mhs2 = new Mahasiswa("2202", "Budi Santoso", "Informatika");
        Mahasiswa mhs3 = new Mahasiswa("2203", "Citra Dewi", "Sistem Informasi Bisnis");

        Mahasiswa[] listMhs = {
            mhs1, mhs2, mhs3
        };
    
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Desain Web", 3);

        MataKuliah[] listMk = {
            mk1, mk2, mk3
        };
    
        Penilaian[] listPenilaian = {
            new Penilaian(mhs1, mk1, 80, 85, 90),
            new Penilaian(mhs1, mk2, 60, 75, 70),
            new Penilaian(mhs2, mk1, 75, 70, 80),
            new Penilaian(mhs3, mk2, 85, 90, 95),
            new Penilaian(mhs3, mk3, 80, 90, 65)
        };

        DaftarMahasiswa daftarMahasiswa = new DaftarMahasiswa(listPenilaian, listMhs);

        // // tambah data mahasiswa
        // daftarMahasiswa.tambahMhs(mhs1);
        // daftarMahasiswa.tambahMhs(mhs2);
        // daftarMahasiswa.tambahMhs(mhs3);

        // // tambah data hasil penilaian
        // daftarMahasiswa.tambah(nilaiMhs1);
        // daftarMahasiswa.tambah(nilaiMhs2);
        // daftarMahasiswa.tambah(nilaiMhs3);
        // daftarMahasiswa.tambah(nilaiMhs4);
        // daftarMahasiswa.tambah(nilaiMhs5);
     
        // // Menu 3
        // daftarMahasiswa.tampilMahasiswa();
        // daftarMataKuliah.tampilDataMataKuliah();
        // daftarMahasiswa.tampilkanDataPenilaian();
        
        // // Menu 4
        // daftarMahasiswa.bubbleSort();
        // daftarMahasiswa.tampilkanDataPenilaian();

        // // Menu 5
        // daftarMahasiswa.sortByNIM();
        // daftarMahasiswa.searchByNIM("2202");
    

        int pilihan;
        do {
            System.out.println("\n===== MENU SIAKAD =====");
            System.out.println("1. Tampilkan Semua Data Mata Kuliah");
            System.out.println("2. Tampilkan Semua Data Mahasiswa");
            System.out.println("3. Tampilkan Data Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir (Descending)");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Data Mahasiswa ---");
                    for (Mahasiswa mahasiswa : listMhs) {
                        System.out.println("NIM: " + mahasiswa.nim + " | " + 
                        "Nama: " + mahasiswa.nama + " | " + "Prodi: " + mahasiswa.prodi);
                    }

                    break;

                case 2:
                    System.out.println("\n--- Data Mata Kuliah ---");
                    for (MataKuliah mataKuliah : listMk) {
                        System.out.println("Kode MK: " + mataKuliah.kodeMK + " | " +
                        "Nama MK: " +  mataKuliah.namaMK + " | " + "SKS: " + mataKuliah.sks); 
                    }
                    break;

                case 3:
                    System.out.println("\n--- Data Penilaian ---");
                    daftarMahasiswa.tampilkanDataPenilaian();
                    break;

                case 4:
                    System.out.println("\n--- Data Penilaian Setelah Diurutkan Berdasarkan Nilai Akhir ---");
                    daftarMahasiswa.bubbleSort(); // descending
                    daftarMahasiswa.tampilkanDataPenilaian();
                    break;

                case 5:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = input.nextLine();
                    daftarMahasiswa.sortByNIM(); // bubble sort ascending
                    daftarMahasiswa.searchByNIM(nim);
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);

        input.close();
    }
}
