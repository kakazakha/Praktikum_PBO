public class Bus extends Kendaraan implements DapatDisewa {

    public Bus(String platNomor, String merk, int tahunProduksi) {
        super(platNomor, merk, tahunProduksi);
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return 1000000 * hari;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }
}