class Animal {
    public static void suara() {
        System.out.println("Suara hewan");
    }

    void makan(){
        System.out.println("Hewan makan");
    }
} 

class Dog extends Animal {
    @Override
    void makan() {
        System.out.println("Anjing makan daging");
    }
}

public class Main2 {
    public static void main(String[] args){
        Animal a = new Animal();
        // a.suara();
        Animal.suara(); //Static (ga perlu buat object dari class animal)
        a.makan();

        Animal b = new Dog();

        b.makan(); //Dynamic Binding
    }
}
