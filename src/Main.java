// No.1
class Hewan {
    String suara = "Suara hewan";
}

class Kucing extends Hewan {
    String suara = "Meong";

    void tampilkanSuara() {
        System.out.println("suara milik kelas Kucing: " + suara);
        System.out.println("suara milik kelas Hewan: " + super.suara);
    }
}

// No.2
class Kendaraan {
    Kendaraan() {
        System.out.println("Konstruktor Kendaraan dipanggil");
    }
}

class Mobil extends Kendaraan {
    Mobil() {
        super();
        System.out.println("Konstruktor Mobil dipanggil");
    }
}

public class Main {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.tampilkanSuara();
        Mobil m = new Mobil();
    }
}
