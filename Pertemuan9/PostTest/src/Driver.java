public class Driver {
    String name;
    Vehicle vehicle;
    License license;

    public Driver(String name, Vehicle vehicle, String nomorLisensi, String tanggalBerlaku) {
        this.name = name;
        this.vehicle = vehicle;
        this.license = new License(nomorLisensi, tanggalBerlaku);
    }

    public void showInfo() {
        System.out.println("Nama Pengemudi: " + name);
        if (vehicle instanceof Car) {
            System.out.println("Jenis Kendaraan: Mobil");
        } else if (vehicle instanceof Motorcycle) {
            System.out.println("Jenis Kendaraan: Motor");
        } else {
            System.out.println("Jenis Kendaraan: Tidak diketahui");
        }
        System.out.print("Status Mesin: ");
        vehicle.startEngine();
        System.out.println("Nomor Lisensi: " + license.nomorLisensi);
        System.out.println("Tanggal Berlaku Lisensi: " + license.tanggalBerlaku);
        System.out.println();
    }
}
