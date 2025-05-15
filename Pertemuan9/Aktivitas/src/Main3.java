class Animal{
    void eat(){
        System.out.println("Makan");
    }
}

class Dog extends Animal{
    void soundAnjing(){
        System.out.println("Guguk");
    }
}

class Pig extends Animal{
    void soundBabi(){
        System.out.println("OinkOink");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.soundAnjing();
        
        Pig pig = new Pig();
        pig.eat();
        pig.soundBabi();
    }
}
