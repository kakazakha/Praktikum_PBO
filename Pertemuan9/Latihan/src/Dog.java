public class Dog extends Animal {
    public Dog(String nama, String nomorRekamMedis, String tanggalPembuatan) {
        super(nama, nomorRekamMedis, tanggalPembuatan);
    }

    @Override
    public void makeSound() {
        System.out.println("Guk Guk!");
    }
}
