class Transportasi {
    private String nama;
    private int jumlahKursi;
    private String tujuan;

    public Transportasi(String nama, int jumlahKursi, String tujuan) {
        this.nama = nama;
        this.jumlahKursi = jumlahKursi;
        this.tujuan = tujuan;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlahKursi() {
        return this.jumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        this.jumlahKursi = jumlahKursi;
    }

    public String getTujuan() {
        return this.tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double hitungHargaTiket() {
        return 100000;
    }
}

class Bus extends Transportasi {
    public Bus(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.1;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double tempat = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return tempat * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return tempat * 1.5;
        }
        return tempat;
    }
}

class Kereta extends Transportasi {
    public Kereta(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.2;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double tempat = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return tempat * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return tempat * 1.5;
        }
        return tempat;
    }
}

class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.5;
    }

    public double hitungHargaTiket(String kelasLayanan) {
        double tempat = hitungHargaTiket();
        if (kelasLayanan.equalsIgnoreCase("Bisnis")) {
            return tempat * 1.25;
        } else if (kelasLayanan.equalsIgnoreCase("VIP")) {
            return tempat * 1.5;
        }
        return tempat;
    }
}

public class Main {
    public static void main(String[] args) {
        Transportasi[] transList = new Transportasi[3];

        transList[0] = new Bus("Bus", 50, "Bandung");
        transList[1] = new Kereta("Kereta", 100, "Surabaya");
        transList[2] = new Pesawat("Pesawat", 70, "Medan");

        for (Transportasi transportasi : transList) {
            System.out.println("Nama Transportasi: " + transportasi.getNama());
            System.out.println("Jumlah Kursi: " + transportasi.getJumlahKursi());
            System.out.println("Tujuan: " + transportasi.getTujuan());

            System.out.println(transportasi.getNama() + " ke " + transportasi.getTujuan()
                    + " - Harga tiket (default): " + transportasi.hitungHargaTiket());

            

            double hargaKelas = 0;
            if (transportasi instanceof Bus) {
                hargaKelas = ((Bus) transportasi).hitungHargaTiket("Bisnis");
                System.out.println(transportasi.getNama() + " ke " + transportasi.getTujuan()
                        + " - Harga tiket (Bisnis): " + hargaKelas);
                        System.out.println("=======================================");
            } else if (transportasi instanceof Kereta) {
                hargaKelas = ((Kereta) transportasi).hitungHargaTiket("VIP");
                System.out.println(transportasi.getNama() + " ke " + transportasi.getTujuan()
                        + " - Harga tiket (VIP): " + hargaKelas);
                        System.out.println("=======================================");
            } else if (transportasi instanceof Pesawat) {
                hargaKelas = ((Pesawat) transportasi).hitungHargaTiket("Ekonomi");
                System.out.println(transportasi.getNama() + " ke " + transportasi.getTujuan()
                        + " - Harga tiket (Ekonomi): " + hargaKelas);
            }

            System.out.println();
        }
    }
}