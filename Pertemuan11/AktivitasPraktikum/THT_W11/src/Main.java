public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("B 1234 TYU", "Hyundai", 2022);
        Kendaraan bus = new Bus("D 5678 QWE", "Mercedes", 2020);
        Truk truk = new Truk("F 9012 ASD", "BMW", 2019, 5000); // 5000 kg

        System.out.println("++ Mobil ++");
        mobil.tampilkanInfo();
        System.out.println("Biaya Sewa 3 hari: Rp " + mobil.hitungBiayaSewa(3));
        System.out.println("Perlu Supir: " + mobil.perluSupir());
        System.out.println();

        System.out.println("++ Bus ++");
        bus.tampilkanInfo();
        System.out.println("Biaya Sewa 2 hari: Rp " + bus.hitungBiayaSewa(2));
        System.out.println("Perlu Supir: " + bus.perluSupir());
        System.out.println();

        System.out.println("++ Truk ++");
        truk.tampilkanInfo();
        System.out.println("Biaya Sewa 5 hari: Rp " + truk.hitungBiayaSewa(5));
        System.out.println("Perlu Supir: " + truk.perluSupir());
        System.out.println("Kapasitas Muatan: " + truk.kapasitasMuatan() + " kg");
    }
}
