public class Owner {
    String nama;
    Animal[] hewanPeliharaan;

    public Owner(String nama, Animal[] hewanPeliharaan) {
        this.nama = nama;
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void showInfo() {
        System.out.println("Nama Pemilik: " + nama);
        for (Animal hewan : hewanPeliharaan) {
            System.out.println("\nNama Hewan: " + hewan.nama);
            System.out.print("Suara: ");
            hewan.makeSound();

            // Menentukan jenis hewan dengan instanceof
            if (hewan instanceof Dog) {
                System.out.println("Jenis Hewan: Dog");
            } else if (hewan instanceof Cat) {
                System.out.println("Jenis Hewan: Cat");
            } else {
                System.out.println("Jenis Hewan: Tidak diketahui");
            }

            System.out.println("Nomor Rekam Medis: " + hewan.healthRecord.nomorRekamMedis);
            System.out.println("Tanggal Pembuatan Rekam Medis: " + hewan.healthRecord.tanggalPembuatan);
        }
    }
}

