package overriding;

class Animal{
    public void suara(){
        System.out.println("Cetak Suara");
    }
}

class Dog extends Animal{
    @Override
    public void suara(){
        System.out.println("Guk Guk");
    }
}

public class Main {
    
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara();
    }
}