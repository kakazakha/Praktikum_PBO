public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        Driver driver1 = new Driver("Kaka", car, "DD123", "2027-05-01");
        Driver driver2 = new Driver("Kiki", motorcycle, "DD456", "2028-01-15");

        driver1.showInfo();
        driver2.showInfo();
    }
}
