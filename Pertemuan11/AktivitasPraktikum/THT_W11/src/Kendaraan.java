public abstract class Kendaraan {
    String platNomor;
    String merk;
    int tahunProduksi ;

    Kendaraan(String platNomor, String merk, int tahunProduksi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    void tampilkanInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    public abstract double hitungBiayaSewa(int hari);
    public abstract boolean perluSupir();
}