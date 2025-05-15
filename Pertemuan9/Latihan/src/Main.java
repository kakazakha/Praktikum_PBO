public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Bob", "D123", "2025-05-01");
        Animal cat = new Cat("Jamal", "C456", "2025-05-02");

        Animal[] hewan = {dog, cat};
        Owner owner = new Owner("Dobleh", hewan);

        owner.showInfo();
    }
}
