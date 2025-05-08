// Super class / Parent class   
class Kendaraan{
    Kendaraan(){
        System.out.println("ini constructor parent");
    }
    String merk = "Toyota";
    void jalan(){
        System.out.println("kendaraan sedang berjalan");
    }
}

// Sub class / child class
class Mobil extends Kendaraan{
    String merk = "BMW";

    Mobil(){
        super();
        System.out.println("Ini constructor child"); 
    }

    void printinfo(){
        System.out.println("merk mobil child " + merk);
        System.out.println("merk mobil parent " + super.merk);
        jalan();
    }

    void klakson(String merk){
        System.out.println("Mobil " + super.merk + " Klakson");
    }
}


public class Main{
    public static void main(String[] args){
        Mobil jazz = new Mobil();
        jazz.printinfo();
        //jazz.jalan();
        jazz.klakson("BMW");
        System.out.println(jazz.merk);

    }
}


