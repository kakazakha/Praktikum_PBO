public class Cat extends Animal {
    public Cat(String nama, String nomorRekamMedis, String tanggalPembuatan) {
        super(nama, nomorRekamMedis, tanggalPembuatan);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaaaww!");
    }
}
