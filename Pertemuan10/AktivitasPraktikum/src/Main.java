class Animal{
    public void suara(){
        System.out.println("Cetak Suara");
    }
    public void makan(String lauk){
        System.out.println("Hewan Makan " + lauk);
    }
}


class Dog extends Animal{
    @Override
    public void suara(){
        System.out.println("Guk Guk");
    }

    
    public void makan(String lauk, String minuman){
        System.out.println("Hewan Makan " + lauk + " Dan Minum " + minuman);
    }
}

public class Main {
    
    public static void main(String[] args) {
        Animal a = new Animal();
        a.suara();

        Animal d = new Dog();
        d.suara();
        d.makan("Ayam Goreng"); // method dari parent

        Dog anjing = new Dog();
        anjing.makan("Tulang", "Air");
    }
}