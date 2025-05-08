// No. 1
class Bangunan {
    String nama = "Bangunan Umum";
}

class GedungSekolah extends Bangunan {
    String nama = "Gedung Sekolah ABC";

    void tampilkanInfo() {
        System.out.println("Nama milik subclass: " + nama);
        System.out.println("Nama milik superclass: " + super.nama);
    }
}

// No. 2
class Orang {
    Orang() {
        System.out.println("Orang dibuat");
    }
}

class Dosen extends Orang {
    Dosen() {
        super();
        System.out.println("Dosen dibuat");
    }
}

// No. 3
class Produk {
    int harga = 10000;
}

class Buku extends Produk {
    int harga = 25000;

    void bandingkanHarga() {
        System.out.println("Harga di subclass: " + harga);
        System.out.println("Harga di superclass: " + super.harga);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Soal 1 ---");
        GedungSekolah gs = new GedungSekolah();
        gs.tampilkanInfo();

        System.out.println("\n--- Soal 2 ---");
        Dosen d = new Dosen();

        System.out.println("\n--- Soal 3 ---");
        Buku b = new Buku();
        b.bandingkanHarga();
    }
}