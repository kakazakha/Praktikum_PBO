public class Animal {
    String nama;
    HealthRecord healthRecord;

    public Animal(String nama, String nomorRekamMedis, String tanggalPembuatan) {
        this.nama = nama;
        this.healthRecord = new HealthRecord(nomorRekamMedis, tanggalPembuatan);
    }

    // Method biasa yang akan dioverride
    public void makeSound() {
        System.out.println("Suara hewan");
    }
}
